package com.example.sql;

import java.util.Set;
import java.util.HashSet;

import com.intellij.lexer.FlexLexer;

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;

import com.example.sql.psi.SqlTypes;

%%

%class SqlLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%{
  // SQL keywords
  private static final Set<String> KEYWORDS = Set.of(
      "alter",
      "and",
      "asc",
      "by",
      "case",
      "check",
      "create",
      "default",
      "delete",
      "desc",
      "distinct",
      "drop",
      "else",
      "end",
      "exists",
      "foreign",
      "from",
      "full",
      "group",
      "having",
      "in",
      "index",
      "inner",
      "insert",
      "into",
      "is",
      "join",
      "key",
      "left",
      "like",
      "limit",
      "not",
      "null",
      "offset",
      "on",
      "or",
      "order",
      "primary",
      "references",
      "right",
      "select",
      "set",
      "table",
      "then",
      "union",
      "unique",
      "update",
      "values",
      "when",
      "where"
  );

  private static boolean isKeyword(CharSequence word) {
      return KEYWORDS.contains(word.toString().toLowerCase());
  }
%}


%eof{  return;
%eof}

// common
LineTerminator = \R
WhiteSpace = [ \n\t\f]
BlockCommentContent = ([^*]|\*+[^/])+

// SQL tokens
BlockCommentStart = "/*"
BlockCommentEnd = "*/"
LineComment = "--" .* {LineTerminator}?
Word = [:jletterdigit:]+
Number = \d+
String = \'((\'\')|[^\'])*\'

// EL tokens
El_Number = \d+(L|(\.\d+)?[FDB])?
El_String = \"((\"\")|[^\"])*\"
El_Char = \'.\'
El_Identifier = [:jletter:][:jletterdigit:]*
El_NonWordPart = [=<>\-,/*();\R \n\t\f]

%state EXPRESSION DIRECTIVE BLOCK_COMMENT PARSER_LEVEL_COMMENT

%%

<YYINITIAL> {
  {BlockCommentStart}/[%#\^]                   { yybegin(DIRECTIVE); return SqlTypes.BLOCK_COMMENT_START; }
  {BlockCommentStart}/[@\"' \n\t\f[:jletter:]] { yybegin(EXPRESSION); return SqlTypes.BLOCK_COMMENT_START; }
  {BlockCommentStart}                          { yybegin(BLOCK_COMMENT); return SqlTypes.BLOCK_COMMENT_START; }
  {LineComment}                                { return SqlTypes.LINE_COMMENT; }
  {String}                                     { return SqlTypes.STRING; }
  {Number}                                     { return SqlTypes.NUMBER; }
  {Word}                                       { return isKeyword(yytext()) ? SqlTypes.KEYWORD : SqlTypes.WORD; }
  ({LineTerminator}|{WhiteSpace})+             { return TokenType.WHITE_SPACE; }
  [^]                                          { return SqlTypes.OTHER; }
}

<EXPRESSION> {
  {BlockCommentEnd}                            { yybegin(YYINITIAL); return SqlTypes.BLOCK_COMMENT_END; }
  ":"                                          { return SqlTypes.EL_SEPARATOR; }
  "."                                          { return SqlTypes.EL_DOT; }
  ","                                          { return SqlTypes.EL_COMMA; }
  "("                                          { return SqlTypes.EL_LEFT_PAREN; }
  ")"                                          { return SqlTypes.EL_RIGHT_PAREN; }
  "@"                                          { return SqlTypes.EL_AT_SIGN; }
  "+"                                          { return SqlTypes.EL_PLUS;}
  "-"                                          { return SqlTypes.EL_MINUS;}
  "*"                                          { return SqlTypes.EL_ASTERISK;}
  "/"                                          { return SqlTypes.EL_SLASH;}
  "%"                                          { return SqlTypes.EL_PERCENT;}
  "=="                                         { return SqlTypes.EL_EQ;}
  "!="                                         { return SqlTypes.EL_NE;}
  "<"                                          { return SqlTypes.EL_LT;}
  "<="                                         { return SqlTypes.EL_LE;}
  ">"                                          { return SqlTypes.EL_GT;}
  ">="                                         { return SqlTypes.EL_GE;}
  "!"                                          { return SqlTypes.EL_NOT;}
  "&&"                                         { return SqlTypes.EL_AND;}
  "||"                                         { return SqlTypes.EL_OR;}
  "new"                                        { return SqlTypes.EL_NEW;}
  "null"                                       { return SqlTypes.EL_NULL;}
  "true"                                       { return SqlTypes.EL_BOOLEAN;}
  "false"                                      { return SqlTypes.EL_BOOLEAN;}
  {El_Number}                                  { return SqlTypes.EL_NUMBER; }
  {El_String}                                  { return SqlTypes.EL_STRING; }
  {El_Char}                                    { return SqlTypes.EL_CHAR; }
  {El_Identifier}                              { return SqlTypes.EL_IDENTIFIER; }
  ({LineTerminator}|{WhiteSpace})+             { return TokenType.WHITE_SPACE; }
  [^]                                          { return TokenType.BAD_CHARACTER; }
}

<DIRECTIVE> {
  {BlockCommentEnd}                            { yybegin(YYINITIAL); return SqlTypes.BLOCK_COMMENT_END; }
  "%if"/{El_NonWordPart}                       { yybegin(EXPRESSION); return SqlTypes.EL_IF; }
  "%elseif"/{El_NonWordPart}                   { yybegin(EXPRESSION); return SqlTypes.EL_ELSEIF; }
  "%else"/{El_NonWordPart}                     { yybegin(EXPRESSION); return SqlTypes.EL_ELSE; }
  "%for"/{El_NonWordPart}                      { yybegin(EXPRESSION); return SqlTypes.EL_FOR; }
  "%expand"/{El_NonWordPart}                   { yybegin(EXPRESSION); return SqlTypes.EL_EXPAND; }
  "%populate"/{El_NonWordPart}                 { yybegin(EXPRESSION); return SqlTypes.EL_POPULATE; }
  "%end"/{El_NonWordPart}                      { yybegin(EXPRESSION); return SqlTypes.EL_END; }
  "%!"                                         { yybegin(PARSER_LEVEL_COMMENT); return SqlTypes.EL_PARSER_LEVEL_COMMENT; }
  "#"                                          { yybegin(EXPRESSION); return SqlTypes.EL_HASH; }
  "^"                                          { yybegin(EXPRESSION); return SqlTypes.EL_CARET; }
  ({LineTerminator}|{WhiteSpace})+             { return TokenType.WHITE_SPACE; }
  [^]                                          { return TokenType.BAD_CHARACTER; }
}

<BLOCK_COMMENT> {
  {BlockCommentEnd}                            { yybegin(YYINITIAL); return SqlTypes.BLOCK_COMMENT_END; }
  {BlockCommentContent}                        { return SqlTypes.BLOCK_COMMENT_CONTENT; }
  [^]                                          { return TokenType.BAD_CHARACTER; }
}

<PARSER_LEVEL_COMMENT> {
  {BlockCommentEnd}                            { yybegin(YYINITIAL); return SqlTypes.BLOCK_COMMENT_END; }
  {BlockCommentContent}                        { return SqlTypes.BLOCK_COMMENT_CONTENT; }
  [^]                                          { return TokenType.BAD_CHARACTER; }
}
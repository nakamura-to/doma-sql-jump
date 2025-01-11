// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.example.directive;

import java.util.Set;
import java.util.HashSet;

import com.example.directive.psi.DirectiveTypes;

import com.intellij.lexer.FlexLexer;

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;

import com.example.directive.psi.DirectiveTypes;

%%

%class DirectiveLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%{
%}


%eof{  return;
%eof}

LineTerminator = \R
WhieteSpace = [ \n\t\f]
If = "%if"
Else = "%else"
ElseIf = "%elseif"
For = "%for"
Expand = "%expand"
Populate = "%populate"
End = "%end"
Embedded = "#"
Literal = "^"
ForSeparator = ":"
Null = "null"
True = "true"
False = "false"
Dot = "."
Comma = ","
Eq = "=="
Ne = "!="
Lt = "<"
Le = "<="
Gt = ">"
Ge = ">="
Not = "!"
And = "&&"
Or = "||"
LeftParen = "("
RightParen = ")"
AtSign = "@"
Float = 0(.[0-9]*)? | [1-9][0-9]*(\.[0-9]*)?F
Double = 0(.[0-9]*)? | [1-9][0-9]*(\.[0-9]*)?D
Decimal = 0(.[0-9]*)? | [1-9][0-9]*(\.[0-9]*)?B
Long = \d+L
Int = \d+
String = \"([^\"\\]|\\\"|\\)*\"
Char = \'([^\'\\]|\\\')\'
Identifier = [:jletter:][:jletterdigit:]*
ClassRef = @\w+(\.\w+)*@

%%

<YYINITIAL> {
  {If}         { return DirectiveTypes.IF; }
  {Else}       { return DirectiveTypes.ELSE; }
  {ElseIf}     { return DirectiveTypes.ELSEIF; }
  {For}     { return DirectiveTypes.FOR; }
  {Expand}     { return DirectiveTypes.EXPAND; }
  {Populate}     { return DirectiveTypes.POPULATE; }
  {End}     { return DirectiveTypes.END; }
  {Embedded}     { return DirectiveTypes.EMBEDDED; }
  {Literal}     { return DirectiveTypes.LITERAL; }
  {ForSeparator}     { return DirectiveTypes.FOR_SEPARATOR; }
  {Null}            { return DirectiveTypes.NULL;}
  {True}                { return DirectiveTypes.TRUE;}
  {False}                { return DirectiveTypes.FALSE;}
  {Dot}                             { return  DirectiveTypes.DOT; }
  {Comma}                             { return  DirectiveTypes.COMMA; }
  {Eq}                { return DirectiveTypes.EQ;}
  {Ne}                { return DirectiveTypes.NE;}
  {Lt}                { return DirectiveTypes.LT;}
  {Le}                { return DirectiveTypes.LE;}
  {Gt}                { return DirectiveTypes.GT;}
  {Ge}                { return DirectiveTypes.GE;}
  {Gt}                { return DirectiveTypes.GT;}
  {Not}                { return DirectiveTypes.NOT;}
  {And}                { return DirectiveTypes.AND;}
  {Or}                { return DirectiveTypes.OR;}

  {LeftParen}                       { return  DirectiveTypes.LEFT_PAREN; }
  {RightParen}                       { return  DirectiveTypes.RIGHT_PAREN; }

  {AtSign}                                 { return DirectiveTypes.AT_SIGN; }
  {Float}                          { return DirectiveTypes.FLOAT; }
  {Double}                         { return DirectiveTypes.DOUBLE; }
  {Decimal}                            { return  DirectiveTypes.DECIMAL; }
  {Long}                            { return  DirectiveTypes.LONG; }
  {Int}                            { return  DirectiveTypes.INT; }
  {String}                            { return  DirectiveTypes.STRING; }
  {Char}                            { return  DirectiveTypes.CHAR; }

  {ClassRef}                        { return DirectiveTypes.CLASS_REF; }
  {Identifier}                           { return DirectiveTypes.IDENTIFIER; }

  ({LineTerminator}|{WhieteSpace})+ { return TokenType.WHITE_SPACE; }

  [^]                                                 { return TokenType.BAD_CHARACTER; }
}
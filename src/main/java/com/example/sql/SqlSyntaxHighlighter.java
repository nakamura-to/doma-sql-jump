package com.example.sql;

import com.example.sql.psi.SqlTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class SqlSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final Map<IElementType, TextAttributesKey> map = new HashMap<>(64);

    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("SQL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey STRING =
            createTextAttributesKey("SQL_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER =
            createTextAttributesKey("SQL_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey BLOCK_COMMENT_START =
            createTextAttributesKey("SQL_BLOCK_COMMENT_START", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    public static final TextAttributesKey BLOCK_COMMENT_END =
            createTextAttributesKey("SQL_BLOCK_COMMENT_END", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    public static final TextAttributesKey BLOCK_COMMENT_CONTENT =
            createTextAttributesKey("SQL_BLOCK_COMMENT_CONTENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    public static final TextAttributesKey LINE_COMMENT =
            createTextAttributesKey("SQL_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);

    public static final TextAttributesKey EL_IDENTIFIER =
            createTextAttributesKey("EL_IDENTIFIER", DefaultLanguageHighlighterColors.DOC_COMMENT_TAG_VALUE);
    public static final TextAttributesKey EL_IF =
            createTextAttributesKey("EL_IF", DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey EL_ELSEIF =
            createTextAttributesKey("EL_ELSEIF", DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey EL_ELSE =
            createTextAttributesKey("EL_ELSE", DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey EL_FOR =
            createTextAttributesKey("EL_FOR", DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey EL_EXPAND =
            createTextAttributesKey("EL_EXPAND", DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey EL_POPULATE =
            createTextAttributesKey("EL_POPULATE", DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey EL_PARSER_LEVEL_COMMENT =
            createTextAttributesKey("EL_PARSER_LEVEL_COMMENT", DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey EL_END =
            createTextAttributesKey("EL_END", DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey EL_EMBEDDED =
            createTextAttributesKey("EL_EMBEDDED", DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey EL_LITERAL =
            createTextAttributesKey("EL_LITERAL", DefaultLanguageHighlighterColors.METADATA);


    public static final TextAttributesKey EL_DOT =
            createTextAttributesKey("EL_DOT", DefaultLanguageHighlighterColors.DOT);
    public static final TextAttributesKey EL_COMMA =
            createTextAttributesKey("EL_COMMA", DefaultLanguageHighlighterColors.COMMA);
    public static final TextAttributesKey EL_AT_SIGN =
            createTextAttributesKey("EL_AT_SIGN", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey EL_LEFT_PAREN =
            createTextAttributesKey("EL_LEFT_PAREN", DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey EL_RIGHT_PAREN =
            createTextAttributesKey("EL_RIGHT_PAREN", DefaultLanguageHighlighterColors.PARENTHESES);

    public static final TextAttributesKey EL_PLUS =
            createTextAttributesKey("EL_PLUS", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey EL_MINUS =
            createTextAttributesKey("EL_MINUS", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey EL_ASTERISK =
            createTextAttributesKey("EL_ASTERISK", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey EL_SLASH =
            createTextAttributesKey("EL_SLASH", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey EL_PERCENT =
            createTextAttributesKey("EL_PERCENT", DefaultLanguageHighlighterColors.OPERATION_SIGN);

    public static final TextAttributesKey EL_EQ =
            createTextAttributesKey("EL_EQ", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey EL_NE =
            createTextAttributesKey("EL_NE", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey EL_LT =
            createTextAttributesKey("EL_LT", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey EL_LE =
            createTextAttributesKey("EL_LE", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey EL_GT =
            createTextAttributesKey("EL_GT", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey EL_GE =
            createTextAttributesKey("EL_GE", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey EL_NOT =
            createTextAttributesKey("EL_NOT", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey EL_AND =
            createTextAttributesKey("EL_AND", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey EL_OR =
            createTextAttributesKey("EL_OR", DefaultLanguageHighlighterColors.OPERATION_SIGN);

    public static final TextAttributesKey EL_NEW =
            createTextAttributesKey("EL_NEW", DefaultLanguageHighlighterColors.KEYWORD);

    public static final TextAttributesKey EL_NULL =
            createTextAttributesKey("EL_NULL", DefaultLanguageHighlighterColors.CONSTANT);
    public static final TextAttributesKey EL_BOOLEAN =
            createTextAttributesKey("EL_BOOLEAN", DefaultLanguageHighlighterColors.CONSTANT);
    public static final TextAttributesKey EL_STRING =
            createTextAttributesKey("EL_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey EL_CHAR =
            createTextAttributesKey("EL_CHAR", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey EL_NUMBER =
            createTextAttributesKey("EL_LONG", DefaultLanguageHighlighterColors.NUMBER);

    static {
        map.put(SqlTypes.KEYWORD, KEYWORD);
        map.put(SqlTypes.STRING, STRING);
        map.put(SqlTypes.NUMBER, NUMBER);
        map.put(SqlTypes.BLOCK_COMMENT_START, BLOCK_COMMENT_START);
        map.put(SqlTypes.BLOCK_COMMENT_CONTENT, BLOCK_COMMENT_CONTENT);
        map.put(SqlTypes.BLOCK_COMMENT_END, BLOCK_COMMENT_END);
        map.put(SqlTypes.LINE_COMMENT, LINE_COMMENT);

        map.put(SqlTypes.EL_IDENTIFIER, EL_IDENTIFIER);
        map.put(SqlTypes.EL_IF, EL_IF);
        map.put(SqlTypes.EL_ELSEIF, EL_ELSEIF);
        map.put(SqlTypes.EL_ELSE, EL_ELSE);
        map.put(SqlTypes.EL_EXPAND, EL_EXPAND);
        map.put(SqlTypes.EL_POPULATE, EL_POPULATE);
        map.put(SqlTypes.EL_PARSER_LEVEL_COMMENT, EL_PARSER_LEVEL_COMMENT);
        map.put(SqlTypes.EL_FOR, EL_FOR);
        map.put(SqlTypes.EL_END, EL_END);
        map.put(SqlTypes.EL_EMBEDDED, EL_EMBEDDED);
        map.put(SqlTypes.EL_LITERAL, EL_LITERAL);

        map.put(SqlTypes.EL_DOT, EL_DOT);
        map.put(SqlTypes.EL_COMMA, EL_COMMA);
        map.put(SqlTypes.EL_AT_SIGN, EL_AT_SIGN);
        map.put(SqlTypes.EL_LEFT_PAREN, EL_LEFT_PAREN);
        map.put(SqlTypes.EL_RIGHT_PAREN, EL_RIGHT_PAREN);

        map.put(SqlTypes.EL_PLUS, EL_PLUS);
        map.put(SqlTypes.EL_MINUS, EL_MINUS);
        map.put(SqlTypes.EL_ASTERISK, EL_ASTERISK);
        map.put(SqlTypes.EL_SLASH, EL_SLASH);
        map.put(SqlTypes.EL_PERCENT, EL_PERCENT);

        map.put(SqlTypes.EL_EQ, EL_EQ);
        map.put(SqlTypes.EL_NE, EL_NE);
        map.put(SqlTypes.EL_LT, EL_LT);
        map.put(SqlTypes.EL_LE, EL_LE);
        map.put(SqlTypes.EL_GT, EL_GT);
        map.put(SqlTypes.EL_GE, EL_GE);
        map.put(SqlTypes.EL_NOT, EL_NOT);
        map.put(SqlTypes.EL_AND, EL_AND);
        map.put(SqlTypes.EL_OR, EL_OR);

        map.put(SqlTypes.EL_NEW, EL_NEW);

        map.put(SqlTypes.EL_NULL, EL_NULL);
        map.put(SqlTypes.EL_BOOLEAN, EL_BOOLEAN);
        map.put(SqlTypes.EL_STRING, EL_STRING);
        map.put(SqlTypes.EL_CHAR, EL_CHAR);
        map.put(SqlTypes.EL_NUMBER, EL_NUMBER);
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new SqlLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        return pack(map.get(tokenType));
    }

}
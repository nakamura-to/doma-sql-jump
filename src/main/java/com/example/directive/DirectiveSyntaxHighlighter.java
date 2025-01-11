package com.example.directive;

import com.example.directive.psi.DirectiveTypes;
import com.example.sql.SqlLexerAdapter;
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

public class DirectiveSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final Map<IElementType, TextAttributesKey> map = new HashMap<>();

    public static final TextAttributesKey IDENTIFIER =
            createTextAttributesKey("DIRECTIVE_IDENTIFIER", DefaultLanguageHighlighterColors.INSTANCE_FIELD);
    public static final TextAttributesKey IF =
            createTextAttributesKey("DIRECTIVE_IF", DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey ELSEIF =
            createTextAttributesKey("DIRECTIVE_ELSEIF", DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey ELSE =
            createTextAttributesKey("DIRECTIVE_ELSE", DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey FOR =
            createTextAttributesKey("DIRECTIVE_FOR", DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey EXPAND =
            createTextAttributesKey("DIRECTIVE_EXPAND", DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey POPULATE =
            createTextAttributesKey("DIRECTIVE_POPULATE", DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey END =
            createTextAttributesKey("DIRECTIVE_END", DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey EMBEDDED =
            createTextAttributesKey("DIRECTIVE_EMBEDDED", DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey LITERAL =
            createTextAttributesKey("DIRECTIVE_LITERAL", DefaultLanguageHighlighterColors.METADATA);


    public static final TextAttributesKey DOT =
            createTextAttributesKey("DIRECTIVE_DOT", DefaultLanguageHighlighterColors.DOT);
    public static final TextAttributesKey COMMA =
            createTextAttributesKey("DIRECTIVE_COMMA", DefaultLanguageHighlighterColors.COMMA);
    public static final TextAttributesKey LEFT_PAREN =
            createTextAttributesKey("DIRECTIVE_LEFT_PAREN", DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey RIGHT_PAREN =
            createTextAttributesKey("DIRECTIVE_RIGHT_PAREN", DefaultLanguageHighlighterColors.PARENTHESES);

    public static final TextAttributesKey EQ =
            createTextAttributesKey("DIRECTIVE_EQ", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey NE =
            createTextAttributesKey("DIRECTIVE_NE", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey LT =
            createTextAttributesKey("DIRECTIVE_LT", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey LE =
            createTextAttributesKey("DIRECTIVE_LE", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey GT =
            createTextAttributesKey("DIRECTIVE_GT", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey GE =
            createTextAttributesKey("DIRECTIVE_GE", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey NOT =
            createTextAttributesKey("DIRECTIVE_NOT", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey AND =
            createTextAttributesKey("DIRECTIVE_AND", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey OR =
            createTextAttributesKey("DIRECTIVE_OR", DefaultLanguageHighlighterColors.OPERATION_SIGN);

    public static final TextAttributesKey NULL =
            createTextAttributesKey("DIRECTIVE_NULL", DefaultLanguageHighlighterColors.CONSTANT);
    public static final TextAttributesKey TRUE =
            createTextAttributesKey("DIRECTIVE_TRUE", DefaultLanguageHighlighterColors.CONSTANT);
    public static final TextAttributesKey FALSE =
            createTextAttributesKey("DIRECTIVE_FALSE", DefaultLanguageHighlighterColors.CONSTANT);

    public static final TextAttributesKey STRING =
            createTextAttributesKey("DIRECTIVE_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey CHAR =
            createTextAttributesKey("DIRECTIVE_CHAR", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey LONG =
            createTextAttributesKey("DIRECTIVE_LONG", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey INT =
            createTextAttributesKey("DIRECTIVE_INT", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey FLOAT =
            createTextAttributesKey("DIRECTIVE_FLOAT", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey DOUBLE =
            createTextAttributesKey("DIRECTIVE_DOUBLE", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey DECIMAL =
            createTextAttributesKey("DIRECTIVE_DECIMAL", DefaultLanguageHighlighterColors.NUMBER);

    static {
        map.put(DirectiveTypes.IDENTIFIER, IDENTIFIER);
        map.put(DirectiveTypes.IF, IF);
        map.put(DirectiveTypes.ELSEIF, ELSEIF);
        map.put(DirectiveTypes.ELSE, ELSE);
        map.put(DirectiveTypes.EXPAND, EXPAND);
        map.put(DirectiveTypes.POPULATE, POPULATE);
        map.put(DirectiveTypes.FOR, FOR);
        map.put(DirectiveTypes.END, END);
        map.put(DirectiveTypes.EMBEDDED, EMBEDDED);
        map.put(DirectiveTypes.LITERAL, LITERAL);

        map.put(DirectiveTypes.DOT, DOT);
        map.put(DirectiveTypes.COMMA, COMMA);
        map.put(DirectiveTypes.LEFT_PAREN, LEFT_PAREN);
        map.put(DirectiveTypes.RIGHT_PAREN, RIGHT_PAREN);

        map.put(DirectiveTypes.EQ, EQ);
        map.put(DirectiveTypes.NE, NE);
        map.put(DirectiveTypes.LT, LT);
        map.put(DirectiveTypes.LE, LE);
        map.put(DirectiveTypes.GT, GT);
        map.put(DirectiveTypes.GE, GE);
        map.put(DirectiveTypes.NOT, NOT);
        map.put(DirectiveTypes.AND, AND);
        map.put(DirectiveTypes.OR, OR);

        map.put(DirectiveTypes.NULL, NULL);
        map.put(DirectiveTypes.TRUE, TRUE);
        map.put(DirectiveTypes.FALSE, FALSE);
        map.put(DirectiveTypes.STRING, STRING);
        map.put(DirectiveTypes.CHAR, CHAR);
        map.put(DirectiveTypes.LONG, LONG);
        map.put(DirectiveTypes.INT, INT);
        map.put(DirectiveTypes.FLOAT, FLOAT);
        map.put(DirectiveTypes.DOUBLE, DOUBLE);
        map.put(DirectiveTypes.DECIMAL, DECIMAL);
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new DirectiveLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        return pack(map.get(tokenType));
    }


}
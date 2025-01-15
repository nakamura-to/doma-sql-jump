// This is a generated file. Not intended for manual editing.
package com.example.sql.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.example.sql.psi.impl.*;

public interface SqlTypes {

  IElementType EL_ADD_EXPR = new SqlElementType("EL_ADD_EXPR");
  IElementType EL_AND_EXPR = new SqlElementType("EL_AND_EXPR");
  IElementType EL_DIVIDE_EXPR = new SqlElementType("EL_DIVIDE_EXPR");
  IElementType EL_EQ_EXPR = new SqlElementType("EL_EQ_EXPR");
  IElementType EL_EXPR = new SqlElementType("EL_EXPR");
  IElementType EL_FIELD_ACCESS_EXPR = new SqlElementType("EL_FIELD_ACCESS_EXPR");
  IElementType EL_FUNCTION_CALL_EXPR = new SqlElementType("EL_FUNCTION_CALL_EXPR");
  IElementType EL_GE_EXPR = new SqlElementType("EL_GE_EXPR");
  IElementType EL_GT_EXPR = new SqlElementType("EL_GT_EXPR");
  IElementType EL_ID_EXPR = new SqlElementType("EL_ID_EXPR");
  IElementType EL_LE_EXPR = new SqlElementType("EL_LE_EXPR");
  IElementType EL_LITERAL_EXPR = new SqlElementType("EL_LITERAL_EXPR");
  IElementType EL_LT_EXPR = new SqlElementType("EL_LT_EXPR");
  IElementType EL_METHOD_CALL_EXPR = new SqlElementType("EL_METHOD_CALL_EXPR");
  IElementType EL_MOD_EXPR = new SqlElementType("EL_MOD_EXPR");
  IElementType EL_MULTIPLY_EXPR = new SqlElementType("EL_MULTIPLY_EXPR");
  IElementType EL_NEW_EXPR = new SqlElementType("EL_NEW_EXPR");
  IElementType EL_NE_EXPR = new SqlElementType("EL_NE_EXPR");
  IElementType EL_NOT_EXPR = new SqlElementType("EL_NOT_EXPR");
  IElementType EL_OR_EXPR = new SqlElementType("EL_OR_EXPR");
  IElementType EL_PAREN_EXPR = new SqlElementType("EL_PAREN_EXPR");
  IElementType EL_STATIC_FIELD_ACCESS_EXPR = new SqlElementType("EL_STATIC_FIELD_ACCESS_EXPR");
  IElementType EL_STATIC_METHOD_CALL_EXPR = new SqlElementType("EL_STATIC_METHOD_CALL_EXPR");
  IElementType EL_SUBTRACT_EXPR = new SqlElementType("EL_SUBTRACT_EXPR");

  IElementType BLOCK_COMMENT_CONTENT = new SqlTokenType("BLOCK_COMMENT_CONTENT");
  IElementType BLOCK_COMMENT_END = new SqlTokenType("*/");
  IElementType BLOCK_COMMENT_START = new SqlTokenType("/*");
  IElementType EL_AND = new SqlTokenType("&&");
  IElementType EL_ASTERISK = new SqlTokenType("*");
  IElementType EL_AT_SIGN = new SqlTokenType("@");
  IElementType EL_BOOLEAN = new SqlTokenType("EL_BOOLEAN");
  IElementType EL_CARET = new SqlTokenType("^");
  IElementType EL_CHAR = new SqlTokenType("EL_CHAR");
  IElementType EL_COMMA = new SqlTokenType(",");
  IElementType EL_DOT = new SqlTokenType(".");
  IElementType EL_ELSE = new SqlTokenType("%else");
  IElementType EL_ELSEIF = new SqlTokenType("%elseif");
  IElementType EL_END = new SqlTokenType("%end");
  IElementType EL_EQ = new SqlTokenType("==");
  IElementType EL_EXPAND = new SqlTokenType("%expand");
  IElementType EL_FOR = new SqlTokenType("%for");
  IElementType EL_GE = new SqlTokenType(">=");
  IElementType EL_GT = new SqlTokenType(">");
  IElementType EL_HASH = new SqlTokenType("#");
  IElementType EL_IDENTIFIER = new SqlTokenType("EL_IDENTIFIER");
  IElementType EL_IF = new SqlTokenType("%if");
  IElementType EL_LE = new SqlTokenType("<=");
  IElementType EL_LEFT_PAREN = new SqlTokenType("(");
  IElementType EL_LT = new SqlTokenType("<");
  IElementType EL_MINUS = new SqlTokenType("-");
  IElementType EL_NE = new SqlTokenType("!=");
  IElementType EL_NEW = new SqlTokenType("new");
  IElementType EL_NOT = new SqlTokenType("!");
  IElementType EL_NULL = new SqlTokenType("null");
  IElementType EL_NUMBER = new SqlTokenType("EL_NUMBER");
  IElementType EL_OR = new SqlTokenType("||");
  IElementType EL_PARSER_LEVEL_COMMENT = new SqlTokenType("%!");
  IElementType EL_PERCENT = new SqlTokenType("%");
  IElementType EL_PLUS = new SqlTokenType("+");
  IElementType EL_POPULATE = new SqlTokenType("%populate");
  IElementType EL_RIGHT_PAREN = new SqlTokenType(")");
  IElementType EL_SEPARATOR = new SqlTokenType(":");
  IElementType EL_SLASH = new SqlTokenType("/");
  IElementType EL_STRING = new SqlTokenType("EL_STRING");
  IElementType KEYWORD = new SqlTokenType("KEYWORD");
  IElementType LINE_COMMENT = new SqlTokenType("LINE_COMMENT");
  IElementType NUMBER = new SqlTokenType("NUMBER");
  IElementType OTHER = new SqlTokenType("OTHER");
  IElementType STRING = new SqlTokenType("STRING");
  IElementType WORD = new SqlTokenType("WORD");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == EL_ADD_EXPR) {
        return new SqlElAddExprImpl(node);
      }
      else if (type == EL_AND_EXPR) {
        return new SqlElAndExprImpl(node);
      }
      else if (type == EL_DIVIDE_EXPR) {
        return new SqlElDivideExprImpl(node);
      }
      else if (type == EL_EQ_EXPR) {
        return new SqlElEqExprImpl(node);
      }
      else if (type == EL_FIELD_ACCESS_EXPR) {
        return new SqlElFieldAccessExprImpl(node);
      }
      else if (type == EL_FUNCTION_CALL_EXPR) {
        return new SqlElFunctionCallExprImpl(node);
      }
      else if (type == EL_GE_EXPR) {
        return new SqlElGeExprImpl(node);
      }
      else if (type == EL_GT_EXPR) {
        return new SqlElGtExprImpl(node);
      }
      else if (type == EL_ID_EXPR) {
        return new SqlElIdExprImpl(node);
      }
      else if (type == EL_LE_EXPR) {
        return new SqlElLeExprImpl(node);
      }
      else if (type == EL_LITERAL_EXPR) {
        return new SqlElLiteralExprImpl(node);
      }
      else if (type == EL_LT_EXPR) {
        return new SqlElLtExprImpl(node);
      }
      else if (type == EL_METHOD_CALL_EXPR) {
        return new SqlElMethodCallExprImpl(node);
      }
      else if (type == EL_MOD_EXPR) {
        return new SqlElModExprImpl(node);
      }
      else if (type == EL_MULTIPLY_EXPR) {
        return new SqlElMultiplyExprImpl(node);
      }
      else if (type == EL_NEW_EXPR) {
        return new SqlElNewExprImpl(node);
      }
      else if (type == EL_NE_EXPR) {
        return new SqlElNeExprImpl(node);
      }
      else if (type == EL_NOT_EXPR) {
        return new SqlElNotExprImpl(node);
      }
      else if (type == EL_OR_EXPR) {
        return new SqlElOrExprImpl(node);
      }
      else if (type == EL_PAREN_EXPR) {
        return new SqlElParenExprImpl(node);
      }
      else if (type == EL_STATIC_FIELD_ACCESS_EXPR) {
        return new SqlElStaticFieldAccessExprImpl(node);
      }
      else if (type == EL_STATIC_METHOD_CALL_EXPR) {
        return new SqlElStaticMethodCallExprImpl(node);
      }
      else if (type == EL_SUBTRACT_EXPR) {
        return new SqlElSubtractExprImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}

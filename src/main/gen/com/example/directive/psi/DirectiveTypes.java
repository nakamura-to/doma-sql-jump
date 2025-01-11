// This is a generated file. Not intended for manual editing.
package com.example.directive.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.example.directive.psi.impl.*;

public interface DirectiveTypes {

  IElementType AND_EXPR = new DirectiveElementType("AND_EXPR");
  IElementType BIND_VARIABLE_DIRECTIVE = new DirectiveElementType("BIND_VARIABLE_DIRECTIVE");
  IElementType ELSEIF_DIRECTIVE = new DirectiveElementType("ELSEIF_DIRECTIVE");
  IElementType ELSE_DIRECTIVE = new DirectiveElementType("ELSE_DIRECTIVE");
  IElementType EMBEDDED_VARIABLE_DIRECTIVE = new DirectiveElementType("EMBEDDED_VARIABLE_DIRECTIVE");
  IElementType END_DIRECTIVE = new DirectiveElementType("END_DIRECTIVE");
  IElementType EQ_EXPR = new DirectiveElementType("EQ_EXPR");
  IElementType EXPAND_DIRECTIVE = new DirectiveElementType("EXPAND_DIRECTIVE");
  IElementType EXPR = new DirectiveElementType("EXPR");
  IElementType FIELD_EXPR = new DirectiveElementType("FIELD_EXPR");
  IElementType FOR_DIRECTIVE = new DirectiveElementType("FOR_DIRECTIVE");
  IElementType FUNCTION_EXPR = new DirectiveElementType("FUNCTION_EXPR");
  IElementType GE_EXPR = new DirectiveElementType("GE_EXPR");
  IElementType GT_EXPR = new DirectiveElementType("GT_EXPR");
  IElementType ID_EXPR = new DirectiveElementType("ID_EXPR");
  IElementType IF_DIRECTIVE = new DirectiveElementType("IF_DIRECTIVE");
  IElementType LE_EXPR = new DirectiveElementType("LE_EXPR");
  IElementType LITERAL_EXPR = new DirectiveElementType("LITERAL_EXPR");
  IElementType LITERAL_VARIABLE_DIRECTIVE = new DirectiveElementType("LITERAL_VARIABLE_DIRECTIVE");
  IElementType LT_EXPR = new DirectiveElementType("LT_EXPR");
  IElementType METHOD_EXPR = new DirectiveElementType("METHOD_EXPR");
  IElementType NE_EXPR = new DirectiveElementType("NE_EXPR");
  IElementType NOT_EXPR = new DirectiveElementType("NOT_EXPR");
  IElementType OR_EXPR = new DirectiveElementType("OR_EXPR");
  IElementType PAREN_EXPR = new DirectiveElementType("PAREN_EXPR");
  IElementType POPULATE_DIRECTIVE = new DirectiveElementType("POPULATE_DIRECTIVE");
  IElementType STATIC_FIELD_EXPR = new DirectiveElementType("STATIC_FIELD_EXPR");
  IElementType STATIC_METHOD_EXPR = new DirectiveElementType("STATIC_METHOD_EXPR");

  IElementType AND = new DirectiveTokenType("&&");
  IElementType AT_SIGN = new DirectiveTokenType("@");
  IElementType CHAR = new DirectiveTokenType("CHAR");
  IElementType CLASS_REF = new DirectiveTokenType("CLASS_REF");
  IElementType COMMA = new DirectiveTokenType(",");
  IElementType DECIMAL = new DirectiveTokenType("DECIMAL");
  IElementType DOT = new DirectiveTokenType(".");
  IElementType DOUBLE = new DirectiveTokenType("DOUBLE");
  IElementType ELSE = new DirectiveTokenType("%else");
  IElementType ELSEIF = new DirectiveTokenType("%elseif");
  IElementType EMBEDDED = new DirectiveTokenType("#");
  IElementType END = new DirectiveTokenType("%end");
  IElementType EQ = new DirectiveTokenType("==");
  IElementType EXPAND = new DirectiveTokenType("%expand");
  IElementType FALSE = new DirectiveTokenType("false");
  IElementType FLOAT = new DirectiveTokenType("FLOAT");
  IElementType FOR = new DirectiveTokenType("%for");
  IElementType FOR_SEPARATOR = new DirectiveTokenType(":");
  IElementType GE = new DirectiveTokenType(">=");
  IElementType GT = new DirectiveTokenType(">");
  IElementType IDENTIFIER = new DirectiveTokenType("IDENTIFIER");
  IElementType IF = new DirectiveTokenType("%if");
  IElementType INT = new DirectiveTokenType("INT");
  IElementType LE = new DirectiveTokenType("<=");
  IElementType LEFT_PAREN = new DirectiveTokenType("(");
  IElementType LITERAL = new DirectiveTokenType("^");
  IElementType LONG = new DirectiveTokenType("LONG");
  IElementType LT = new DirectiveTokenType("<");
  IElementType NE = new DirectiveTokenType("!=");
  IElementType NOT = new DirectiveTokenType("!");
  IElementType NULL = new DirectiveTokenType("null");
  IElementType OR = new DirectiveTokenType("||");
  IElementType POPULATE = new DirectiveTokenType("%populate");
  IElementType RIGHT_PAREN = new DirectiveTokenType(")");
  IElementType STRING = new DirectiveTokenType("STRING");
  IElementType TRUE = new DirectiveTokenType("true");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == AND_EXPR) {
        return new DirectiveAndExprImpl(node);
      }
      else if (type == BIND_VARIABLE_DIRECTIVE) {
        return new DirectiveBindVariableDirectiveImpl(node);
      }
      else if (type == ELSEIF_DIRECTIVE) {
        return new DirectiveElseifDirectiveImpl(node);
      }
      else if (type == ELSE_DIRECTIVE) {
        return new DirectiveElseDirectiveImpl(node);
      }
      else if (type == EMBEDDED_VARIABLE_DIRECTIVE) {
        return new DirectiveEmbeddedVariableDirectiveImpl(node);
      }
      else if (type == END_DIRECTIVE) {
        return new DirectiveEndDirectiveImpl(node);
      }
      else if (type == EQ_EXPR) {
        return new DirectiveEqExprImpl(node);
      }
      else if (type == EXPAND_DIRECTIVE) {
        return new DirectiveExpandDirectiveImpl(node);
      }
      else if (type == FIELD_EXPR) {
        return new DirectiveFieldExprImpl(node);
      }
      else if (type == FOR_DIRECTIVE) {
        return new DirectiveForDirectiveImpl(node);
      }
      else if (type == FUNCTION_EXPR) {
        return new DirectiveFunctionExprImpl(node);
      }
      else if (type == GE_EXPR) {
        return new DirectiveGeExprImpl(node);
      }
      else if (type == GT_EXPR) {
        return new DirectiveGtExprImpl(node);
      }
      else if (type == ID_EXPR) {
        return new DirectiveIdExprImpl(node);
      }
      else if (type == IF_DIRECTIVE) {
        return new DirectiveIfDirectiveImpl(node);
      }
      else if (type == LE_EXPR) {
        return new DirectiveLeExprImpl(node);
      }
      else if (type == LITERAL_EXPR) {
        return new DirectiveLiteralExprImpl(node);
      }
      else if (type == LITERAL_VARIABLE_DIRECTIVE) {
        return new DirectiveLiteralVariableDirectiveImpl(node);
      }
      else if (type == LT_EXPR) {
        return new DirectiveLtExprImpl(node);
      }
      else if (type == METHOD_EXPR) {
        return new DirectiveMethodExprImpl(node);
      }
      else if (type == NE_EXPR) {
        return new DirectiveNeExprImpl(node);
      }
      else if (type == NOT_EXPR) {
        return new DirectiveNotExprImpl(node);
      }
      else if (type == OR_EXPR) {
        return new DirectiveOrExprImpl(node);
      }
      else if (type == PAREN_EXPR) {
        return new DirectiveParenExprImpl(node);
      }
      else if (type == POPULATE_DIRECTIVE) {
        return new DirectivePopulateDirectiveImpl(node);
      }
      else if (type == STATIC_FIELD_EXPR) {
        return new DirectiveStaticFieldExprImpl(node);
      }
      else if (type == STATIC_METHOD_EXPR) {
        return new DirectiveStaticMethodExprImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}

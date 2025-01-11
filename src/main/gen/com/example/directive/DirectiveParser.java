// This is a generated file. Not intended for manual editing.
package com.example.directive;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.example.directive.psi.DirectiveTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class DirectiveParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return directive(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(AND_EXPR, EQ_EXPR, EXPR, FIELD_EXPR,
      FUNCTION_EXPR, GE_EXPR, GT_EXPR, ID_EXPR,
      LE_EXPR, LITERAL_EXPR, LT_EXPR, METHOD_EXPR,
      NE_EXPR, NOT_EXPR, OR_EXPR, PAREN_EXPR,
      STATIC_FIELD_EXPR, STATIC_METHOD_EXPR),
  };

  /* ********************************************************** */
  // expr
  public static boolean bind_variable_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bind_variable_directive")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BIND_VARIABLE_DIRECTIVE, "<bind variable directive>");
    r = expr(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // bind_variable_directive
  //     | literal_variable_directive
  //     | embedded_variable_directive
  //     | if_directive
  //     | elseif_directive
  //     | else_directive
  //     | for_directive
  //     | end_directive
  //     | expand_directive
  //     | populate_directive
  static boolean directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "directive")) return false;
    boolean r;
    r = bind_variable_directive(b, l + 1);
    if (!r) r = literal_variable_directive(b, l + 1);
    if (!r) r = embedded_variable_directive(b, l + 1);
    if (!r) r = if_directive(b, l + 1);
    if (!r) r = elseif_directive(b, l + 1);
    if (!r) r = else_directive(b, l + 1);
    if (!r) r = for_directive(b, l + 1);
    if (!r) r = end_directive(b, l + 1);
    if (!r) r = expand_directive(b, l + 1);
    if (!r) r = populate_directive(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // "%else"
  public static boolean else_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_directive")) return false;
    if (!nextTokenIs(b, ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    exit_section_(b, m, ELSE_DIRECTIVE, r);
    return r;
  }

  /* ********************************************************** */
  // "%elseif" expr
  public static boolean elseif_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elseif_directive")) return false;
    if (!nextTokenIs(b, ELSEIF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSEIF);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, ELSEIF_DIRECTIVE, r);
    return r;
  }

  /* ********************************************************** */
  // "#" expr
  public static boolean embedded_variable_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "embedded_variable_directive")) return false;
    if (!nextTokenIs(b, EMBEDDED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EMBEDDED);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, EMBEDDED_VARIABLE_DIRECTIVE, r);
    return r;
  }

  /* ********************************************************** */
  // "%end"
  public static boolean end_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "end_directive")) return false;
    if (!nextTokenIs(b, END)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, END);
    exit_section_(b, m, END_DIRECTIVE, r);
    return r;
  }

  /* ********************************************************** */
  // "%expand" expr?
  public static boolean expand_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expand_directive")) return false;
    if (!nextTokenIs(b, EXPAND)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXPAND);
    r = r && expand_directive_1(b, l + 1);
    exit_section_(b, m, EXPAND_DIRECTIVE, r);
    return r;
  }

  // expr?
  private static boolean expand_directive_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expand_directive_1")) return false;
    expr(b, l + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // "%for" id_expr ":" expr
  public static boolean for_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_directive")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && id_expr(b, l + 1);
    r = r && consumeToken(b, FOR_SEPARATOR);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, FOR_DIRECTIVE, r);
    return r;
  }

  /* ********************************************************** */
  // "%if" expr
  public static boolean if_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_directive")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, IF_DIRECTIVE, r);
    return r;
  }

  /* ********************************************************** */
  // "^" expr
  public static boolean literal_variable_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_variable_directive")) return false;
    if (!nextTokenIs(b, LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITERAL);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, LITERAL_VARIABLE_DIRECTIVE, r);
    return r;
  }

  /* ********************************************************** */
  // "%populate"
  public static boolean populate_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "populate_directive")) return false;
    if (!nextTokenIs(b, POPULATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, POPULATE);
    exit_section_(b, m, POPULATE_DIRECTIVE, r);
    return r;
  }

  /* ********************************************************** */
  // Expression root: expr
  // Operator priority table:
  // 0: ATOM(literal_expr) ATOM(id_expr) PREFIX(paren_expr)
  // 1: BINARY(field_expr) POSTFIX(method_expr) PREFIX(static_field_expr) ATOM(static_method_expr)
  //    ATOM(function_expr)
  // 2: PREFIX(not_expr) BINARY(and_expr) BINARY(or_expr)
  // 3: BINARY(eq_expr) BINARY(ne_expr) BINARY(lt_expr) BINARY(le_expr)
  //    BINARY(gt_expr) BINARY(ge_expr)
  public static boolean expr(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr")) return false;
    addVariant(b, "<expr>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expr>");
    r = literal_expr(b, l + 1);
    if (!r) r = id_expr(b, l + 1);
    if (!r) r = paren_expr(b, l + 1);
    if (!r) r = static_field_expr(b, l + 1);
    if (!r) r = static_method_expr(b, l + 1);
    if (!r) r = function_expr(b, l + 1);
    if (!r) r = not_expr(b, l + 1);
    p = r;
    r = r && expr_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean expr_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 1 && consumeTokenSmart(b, DOT)) {
        r = expr(b, l, 1);
        exit_section_(b, l, m, FIELD_EXPR, r, true, null);
      }
      else if (g < 1 && method_expr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, METHOD_EXPR, r, true, null);
      }
      else if (g < 2 && consumeTokenSmart(b, AND)) {
        r = expr(b, l, 2);
        exit_section_(b, l, m, AND_EXPR, r, true, null);
      }
      else if (g < 2 && consumeTokenSmart(b, OR)) {
        r = expr(b, l, 2);
        exit_section_(b, l, m, OR_EXPR, r, true, null);
      }
      else if (g < 3 && consumeTokenSmart(b, EQ)) {
        r = expr(b, l, 3);
        exit_section_(b, l, m, EQ_EXPR, r, true, null);
      }
      else if (g < 3 && consumeTokenSmart(b, NE)) {
        r = expr(b, l, 3);
        exit_section_(b, l, m, NE_EXPR, r, true, null);
      }
      else if (g < 3 && consumeTokenSmart(b, LT)) {
        r = expr(b, l, 3);
        exit_section_(b, l, m, LT_EXPR, r, true, null);
      }
      else if (g < 3 && consumeTokenSmart(b, LE)) {
        r = expr(b, l, 3);
        exit_section_(b, l, m, LE_EXPR, r, true, null);
      }
      else if (g < 3 && consumeTokenSmart(b, GT)) {
        r = expr(b, l, 3);
        exit_section_(b, l, m, GT_EXPR, r, true, null);
      }
      else if (g < 3 && consumeTokenSmart(b, GE)) {
        r = expr(b, l, 3);
        exit_section_(b, l, m, GE_EXPR, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // NULL | TRUE | FALSE | FLOAT | DOUBLE | DECIMAL | LONG | INT |  STRING | CHAR
  public static boolean literal_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_EXPR, "<literal expr>");
    r = consumeTokenSmart(b, NULL);
    if (!r) r = consumeTokenSmart(b, TRUE);
    if (!r) r = consumeTokenSmart(b, FALSE);
    if (!r) r = consumeTokenSmart(b, FLOAT);
    if (!r) r = consumeTokenSmart(b, DOUBLE);
    if (!r) r = consumeTokenSmart(b, DECIMAL);
    if (!r) r = consumeTokenSmart(b, LONG);
    if (!r) r = consumeTokenSmart(b, INT);
    if (!r) r = consumeTokenSmart(b, STRING);
    if (!r) r = consumeTokenSmart(b, CHAR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IDENTIFIER
  public static boolean id_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_expr")) return false;
    if (!nextTokenIsSmart(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, IDENTIFIER);
    exit_section_(b, m, ID_EXPR, r);
    return r;
  }

  public static boolean paren_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expr")) return false;
    if (!nextTokenIsSmart(b, LEFT_PAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, LEFT_PAREN);
    p = r;
    r = p && expr(b, l, 0);
    r = p && report_error_(b, consumeToken(b, RIGHT_PAREN)) && r;
    exit_section_(b, l, m, PAREN_EXPR, r, p, null);
    return r || p;
  }

  // "(" (expr ("," expr)*)? ")"
  private static boolean method_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LEFT_PAREN);
    r = r && method_expr_0_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (expr ("," expr)*)?
  private static boolean method_expr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_expr_0_1")) return false;
    method_expr_0_1_0(b, l + 1);
    return true;
  }

  // expr ("," expr)*
  private static boolean method_expr_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_expr_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && method_expr_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," expr)*
  private static boolean method_expr_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_expr_0_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!method_expr_0_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "method_expr_0_1_0_1", c)) break;
    }
    return true;
  }

  // "," expr
  private static boolean method_expr_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_expr_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean static_field_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_field_expr")) return false;
    if (!nextTokenIsSmart(b, CLASS_REF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, CLASS_REF);
    p = r;
    r = p && expr(b, l, -1);
    exit_section_(b, l, m, STATIC_FIELD_EXPR, r, p, null);
    return r || p;
  }

  // CLASS_REF id_expr "(" (expr ("," expr)*)? ")"
  public static boolean static_method_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_method_expr")) return false;
    if (!nextTokenIsSmart(b, CLASS_REF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, CLASS_REF);
    r = r && id_expr(b, l + 1);
    r = r && consumeToken(b, LEFT_PAREN);
    r = r && static_method_expr_3(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, STATIC_METHOD_EXPR, r);
    return r;
  }

  // (expr ("," expr)*)?
  private static boolean static_method_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_method_expr_3")) return false;
    static_method_expr_3_0(b, l + 1);
    return true;
  }

  // expr ("," expr)*
  private static boolean static_method_expr_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_method_expr_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && static_method_expr_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," expr)*
  private static boolean static_method_expr_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_method_expr_3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!static_method_expr_3_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "static_method_expr_3_0_1", c)) break;
    }
    return true;
  }

  // "," expr
  private static boolean static_method_expr_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_method_expr_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "@" id_expr "(" (expr ("," expr)*)? ")"
  public static boolean function_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_expr")) return false;
    if (!nextTokenIsSmart(b, AT_SIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, AT_SIGN);
    r = r && id_expr(b, l + 1);
    r = r && consumeToken(b, LEFT_PAREN);
    r = r && function_expr_3(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, FUNCTION_EXPR, r);
    return r;
  }

  // (expr ("," expr)*)?
  private static boolean function_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_expr_3")) return false;
    function_expr_3_0(b, l + 1);
    return true;
  }

  // expr ("," expr)*
  private static boolean function_expr_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_expr_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && function_expr_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," expr)*
  private static boolean function_expr_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_expr_3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!function_expr_3_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_expr_3_0_1", c)) break;
    }
    return true;
  }

  // "," expr
  private static boolean function_expr_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_expr_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean not_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_expr")) return false;
    if (!nextTokenIsSmart(b, NOT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, NOT);
    p = r;
    r = p && expr(b, l, 2);
    exit_section_(b, l, m, NOT_EXPR, r, p, null);
    return r || p;
  }

}

// This is a generated file. Not intended for manual editing.
package com.example.sql;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.example.sql.psi.SqlTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class SqlParser implements PsiParser, LightPsiParser {

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
    return sql_file(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(EL_ADD_EXPR, EL_AND_EXPR, EL_DIVIDE_EXPR, EL_EQ_EXPR,
      EL_EXPR, EL_FACTOR_EXPR, EL_FIELD_ACCESS_EXPR, EL_FUNCTION_CALL_EXPR,
      EL_GE_EXPR, EL_GT_EXPR, EL_LE_EXPR, EL_LT_EXPR,
      EL_METHOD_CALL_EXPR, EL_MOD_EXPR, EL_MULTIPLY_EXPR, EL_NEW_EXPR,
      EL_NE_EXPR, EL_NOT_EXPR, EL_OR_EXPR, EL_PRIMARY_EXPR,
      EL_STATIC_FIELD_ACCESS_EXPR, EL_STATIC_METHOD_CALL_EXPR, EL_SUBTRACT_EXPR, EL_TERM_EXPR),
  };

  /* ********************************************************** */
  // "/*" (el_directive | BLOCK_COMMENT_CONTENT?) "*/"
  static boolean block_comment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_comment")) return false;
    if (!nextTokenIs(b, BLOCK_COMMENT_START)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, BLOCK_COMMENT_START);
    p = r; // pin = 1
    r = r && report_error_(b, block_comment_1(b, l + 1));
    r = p && consumeToken(b, BLOCK_COMMENT_END) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // el_directive | BLOCK_COMMENT_CONTENT?
  private static boolean block_comment_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_comment_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = el_directive(b, l + 1);
    if (!r) r = block_comment_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BLOCK_COMMENT_CONTENT?
  private static boolean block_comment_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_comment_1_1")) return false;
    consumeToken(b, BLOCK_COMMENT_CONTENT);
    return true;
  }

  /* ********************************************************** */
  // block_comment | LINE_COMMENT
  static boolean comment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comment")) return false;
    if (!nextTokenIs(b, "", BLOCK_COMMENT_START, LINE_COMMENT)) return false;
    boolean r;
    r = block_comment(b, l + 1);
    if (!r) r = consumeToken(b, LINE_COMMENT);
    return r;
  }

  /* ********************************************************** */
  // !<<eof>> item
  static boolean content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "content")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = content_0(b, l + 1);
    p = r; // pin = 1
    r = r && item(b, l + 1);
    exit_section_(b, l, m, r, p, SqlParser::content_recover);
    return r || p;
  }

  // !<<eof>>
  private static boolean content_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "content_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !eof(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !item
  static boolean content_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "content_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !item(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // el_factor_expr "+" el_factor_expr
  public static boolean el_add_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_add_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EL_ADD_EXPR, "<el add expr>");
    r = el_factor_expr(b, l + 1);
    r = r && consumeToken(b, EL_PLUS);
    r = r && el_factor_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // el_add_expr | el_subtract_expr | el_multiply_expr | el_divide_expr | el_mod_expr
  static boolean el_arithmetic_expr_group(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_arithmetic_expr_group")) return false;
    boolean r;
    r = el_add_expr(b, l + 1);
    if (!r) r = el_subtract_expr(b, l + 1);
    if (!r) r = el_multiply_expr(b, l + 1);
    if (!r) r = el_divide_expr(b, l + 1);
    if (!r) r = el_mod_expr(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // el_expr
  static boolean el_bind_variable_directive(PsiBuilder b, int l) {
    return el_expr(b, l + 1, -1);
  }

  /* ********************************************************** */
  // el_id_expr ("." el_id_expr)*
  static boolean el_class(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_class")) return false;
    if (!nextTokenIsFast(b, EL_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = el_id_expr(b, l + 1);
    r = r && el_class_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("." el_id_expr)*
  private static boolean el_class_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_class_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!el_class_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "el_class_1", c)) break;
    }
    return true;
  }

  // "." el_id_expr
  private static boolean el_class_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_class_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EL_DOT);
    r = r && el_id_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "@" el_class "@"
  static boolean el_class_ref(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_class_ref")) return false;
    if (!nextTokenIs(b, EL_AT_SIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EL_AT_SIGN);
    r = r && el_class(b, l + 1);
    r = r && consumeToken(b, EL_AT_SIGN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // el_eq_expr | el_ne_expr | el_lt_expr | el_le_expr | el_gt_expr | el_ge_expr
  static boolean el_comparison_expr_group(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_comparison_expr_group")) return false;
    boolean r;
    r = el_eq_expr(b, l + 1);
    if (!r) r = el_ne_expr(b, l + 1);
    if (!r) r = el_lt_expr(b, l + 1);
    if (!r) r = el_le_expr(b, l + 1);
    if (!r) r = el_gt_expr(b, l + 1);
    if (!r) r = el_ge_expr(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // el_bind_variable_directive
  //     | el_literal_variable_directive
  //     | el_embedded_variable_directive
  //     | el_if_directive
  //     | el_elseif_directive
  //     | el_else_directive
  //     | el_for_directive
  //     | el_end_directive
  //     | el_expand_directive
  //     | el_populate_directive
  //     | el_parser_level_comment_directive
  static boolean el_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_directive")) return false;
    boolean r;
    r = el_bind_variable_directive(b, l + 1);
    if (!r) r = el_literal_variable_directive(b, l + 1);
    if (!r) r = el_embedded_variable_directive(b, l + 1);
    if (!r) r = el_if_directive(b, l + 1);
    if (!r) r = el_elseif_directive(b, l + 1);
    if (!r) r = el_else_directive(b, l + 1);
    if (!r) r = el_for_directive(b, l + 1);
    if (!r) r = el_end_directive(b, l + 1);
    if (!r) r = el_expand_directive(b, l + 1);
    if (!r) r = el_populate_directive(b, l + 1);
    if (!r) r = el_parser_level_comment_directive(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // el_factor_expr "/" el_factor_expr
  public static boolean el_divide_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_divide_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EL_DIVIDE_EXPR, "<el divide expr>");
    r = el_factor_expr(b, l + 1);
    r = r && consumeToken(b, EL_SLASH);
    r = r && el_factor_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "%else"
  static boolean el_else_directive(PsiBuilder b, int l) {
    return consumeTokenFast(b, EL_ELSE);
  }

  /* ********************************************************** */
  // "%elseif" el_expr
  static boolean el_elseif_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_elseif_directive")) return false;
    if (!nextTokenIsFast(b, EL_ELSEIF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokenFast(b, EL_ELSEIF);
    p = r; // pin = 1
    r = r && el_expr(b, l + 1, -1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // "#" el_expr
  static boolean el_embedded_variable_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_embedded_variable_directive")) return false;
    if (!nextTokenIsFast(b, EL_HASH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokenFast(b, EL_HASH);
    p = r; // pin = 1
    r = r && el_expr(b, l + 1, -1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // "%end"
  static boolean el_end_directive(PsiBuilder b, int l) {
    return consumeTokenFast(b, EL_END);
  }

  /* ********************************************************** */
  // el_factor_expr "==" el_factor_expr
  public static boolean el_eq_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_eq_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EL_EQ_EXPR, "<el eq expr>");
    r = el_factor_expr(b, l + 1);
    r = r && consumeToken(b, EL_EQ);
    r = r && el_factor_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "%expand" el_expr?
  static boolean el_expand_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_expand_directive")) return false;
    if (!nextTokenIsFast(b, EL_EXPAND)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokenFast(b, EL_EXPAND);
    p = r; // pin = 1
    r = r && el_expand_directive_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // el_expr?
  private static boolean el_expand_directive_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_expand_directive_1")) return false;
    el_expr(b, l + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // el_invocation_expr_group | el_primary_expr
  public static boolean el_factor_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_factor_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EL_FACTOR_EXPR, "<el factor expr>");
    r = el_invocation_expr_group(b, l + 1);
    if (!r) r = el_primary_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // el_instance_member_access
  public static boolean el_field_access_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_field_access_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EL_FIELD_ACCESS_EXPR, "<el field access expr>");
    r = el_instance_member_access(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "%for" el_id_expr ":" el_expr
  static boolean el_for_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_for_directive")) return false;
    if (!nextTokenIsFast(b, EL_FOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokenFast(b, EL_FOR);
    p = r; // pin = 1
    r = r && report_error_(b, el_id_expr(b, l + 1));
    r = p && report_error_(b, consumeToken(b, EL_SEPARATOR)) && r;
    r = p && el_expr(b, l + 1, -1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // "@" el_id_expr el_parameters
  public static boolean el_function_call_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_function_call_expr")) return false;
    if (!nextTokenIsFast(b, EL_AT_SIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenFast(b, EL_AT_SIGN);
    r = r && el_id_expr(b, l + 1);
    r = r && el_parameters(b, l + 1);
    exit_section_(b, m, EL_FUNCTION_CALL_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // el_factor_expr ">=" el_factor_expr
  public static boolean el_ge_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_ge_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EL_GE_EXPR, "<el ge expr>");
    r = el_factor_expr(b, l + 1);
    r = r && consumeToken(b, EL_GE);
    r = r && el_factor_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // el_factor_expr ">" el_factor_expr
  public static boolean el_gt_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_gt_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EL_GT_EXPR, "<el gt expr>");
    r = el_factor_expr(b, l + 1);
    r = r && consumeToken(b, EL_GT);
    r = r && el_factor_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // EL_IDENTIFIER
  static boolean el_id_expr(PsiBuilder b, int l) {
    return consumeTokenFast(b, EL_IDENTIFIER);
  }

  /* ********************************************************** */
  // "%if" el_expr
  static boolean el_if_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_if_directive")) return false;
    if (!nextTokenIsFast(b, EL_IF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokenFast(b, EL_IF);
    p = r; // pin = 1
    r = r && el_expr(b, l + 1, -1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // (el_primary_expr|el_static_member_access) ("." el_id_expr)+
  static boolean el_instance_member_access(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_instance_member_access")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = el_instance_member_access_0(b, l + 1);
    r = r && el_instance_member_access_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // el_primary_expr|el_static_member_access
  private static boolean el_instance_member_access_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_instance_member_access_0")) return false;
    boolean r;
    r = el_primary_expr(b, l + 1);
    if (!r) r = el_static_member_access(b, l + 1);
    return r;
  }

  // ("." el_id_expr)+
  private static boolean el_instance_member_access_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_instance_member_access_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = el_instance_member_access_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!el_instance_member_access_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "el_instance_member_access_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // "." el_id_expr
  private static boolean el_instance_member_access_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_instance_member_access_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EL_DOT);
    r = r && el_id_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // el_method_call_expr | el_field_access_expr | el_static_method_call_expr | el_static_field_access_expr | el_function_call_expr | el_new_expr
  static boolean el_invocation_expr_group(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_invocation_expr_group")) return false;
    boolean r;
    r = el_method_call_expr(b, l + 1);
    if (!r) r = el_field_access_expr(b, l + 1);
    if (!r) r = el_static_method_call_expr(b, l + 1);
    if (!r) r = el_static_field_access_expr(b, l + 1);
    if (!r) r = el_function_call_expr(b, l + 1);
    if (!r) r = el_new_expr(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // el_factor_expr "<=" el_factor_expr
  public static boolean el_le_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_le_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EL_LE_EXPR, "<el le expr>");
    r = el_factor_expr(b, l + 1);
    r = r && consumeToken(b, EL_LE);
    r = r && el_factor_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // EL_NULL | EL_BOOLEAN | (EL_PLUS | EL_MINUS)? EL_NUMBER | EL_STRING | EL_CHAR
  static boolean el_literal_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_literal_expr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenFast(b, EL_NULL);
    if (!r) r = consumeTokenFast(b, EL_BOOLEAN);
    if (!r) r = el_literal_expr_2(b, l + 1);
    if (!r) r = consumeTokenFast(b, EL_STRING);
    if (!r) r = consumeTokenFast(b, EL_CHAR);
    exit_section_(b, m, null, r);
    return r;
  }

  // (EL_PLUS | EL_MINUS)? EL_NUMBER
  private static boolean el_literal_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_literal_expr_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = el_literal_expr_2_0(b, l + 1);
    r = r && consumeToken(b, EL_NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // (EL_PLUS | EL_MINUS)?
  private static boolean el_literal_expr_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_literal_expr_2_0")) return false;
    el_literal_expr_2_0_0(b, l + 1);
    return true;
  }

  // EL_PLUS | EL_MINUS
  private static boolean el_literal_expr_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_literal_expr_2_0_0")) return false;
    boolean r;
    r = consumeTokenFast(b, EL_PLUS);
    if (!r) r = consumeTokenFast(b, EL_MINUS);
    return r;
  }

  /* ********************************************************** */
  // "^" el_expr
  static boolean el_literal_variable_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_literal_variable_directive")) return false;
    if (!nextTokenIsFast(b, EL_CARET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokenFast(b, EL_CARET);
    p = r; // pin = 1
    r = r && el_expr(b, l + 1, -1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // el_factor_expr "<" el_factor_expr
  public static boolean el_lt_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_lt_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EL_LT_EXPR, "<el lt expr>");
    r = el_factor_expr(b, l + 1);
    r = r && consumeToken(b, EL_LT);
    r = r && el_factor_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // el_instance_member_access el_parameters
  public static boolean el_method_call_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_method_call_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EL_METHOD_CALL_EXPR, "<el method call expr>");
    r = el_instance_member_access(b, l + 1);
    r = r && el_parameters(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // el_factor_expr "%" el_factor_expr
  public static boolean el_mod_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_mod_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EL_MOD_EXPR, "<el mod expr>");
    r = el_factor_expr(b, l + 1);
    r = r && consumeToken(b, EL_PERCENT);
    r = r && el_factor_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // el_factor_expr "*" el_factor_expr
  public static boolean el_multiply_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_multiply_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EL_MULTIPLY_EXPR, "<el multiply expr>");
    r = el_factor_expr(b, l + 1);
    r = r && consumeToken(b, EL_ASTERISK);
    r = r && el_factor_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // el_factor_expr "!=" el_factor_expr
  public static boolean el_ne_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_ne_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EL_NE_EXPR, "<el ne expr>");
    r = el_factor_expr(b, l + 1);
    r = r && consumeToken(b, EL_NE);
    r = r && el_factor_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "new" el_class el_parameters
  public static boolean el_new_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_new_expr")) return false;
    if (!nextTokenIsFast(b, EL_NEW)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EL_NEW_EXPR, null);
    r = consumeTokenFast(b, EL_NEW);
    p = r; // pin = 1
    r = r && report_error_(b, el_class(b, l + 1));
    r = p && el_parameters(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // "(" (el_expr ("," el_expr)*)? ")"
  static boolean el_parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_parameters")) return false;
    if (!nextTokenIs(b, EL_LEFT_PAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, EL_LEFT_PAREN);
    p = r; // pin = 1
    r = r && report_error_(b, el_parameters_1(b, l + 1));
    r = p && consumeToken(b, EL_RIGHT_PAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (el_expr ("," el_expr)*)?
  private static boolean el_parameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_parameters_1")) return false;
    el_parameters_1_0(b, l + 1);
    return true;
  }

  // el_expr ("," el_expr)*
  private static boolean el_parameters_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_parameters_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = el_expr(b, l + 1, -1);
    r = r && el_parameters_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," el_expr)*
  private static boolean el_parameters_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_parameters_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!el_parameters_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "el_parameters_1_0_1", c)) break;
    }
    return true;
  }

  // "," el_expr
  private static boolean el_parameters_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_parameters_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EL_COMMA);
    r = r && el_expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "(" el_expr ")"
  static boolean el_paren_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_paren_expr")) return false;
    if (!nextTokenIsFast(b, EL_LEFT_PAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokenFast(b, EL_LEFT_PAREN);
    p = r; // pin = 1
    r = r && report_error_(b, el_expr(b, l + 1, -1));
    r = p && consumeToken(b, EL_RIGHT_PAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // "%!" BLOCK_COMMENT_CONTENT*
  static boolean el_parser_level_comment_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_parser_level_comment_directive")) return false;
    if (!nextTokenIsFast(b, EL_PARSER_LEVEL_COMMENT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokenFast(b, EL_PARSER_LEVEL_COMMENT);
    p = r; // pin = 1
    r = r && el_parser_level_comment_directive_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // BLOCK_COMMENT_CONTENT*
  private static boolean el_parser_level_comment_directive_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_parser_level_comment_directive_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeTokenFast(b, BLOCK_COMMENT_CONTENT)) break;
      if (!empty_element_parsed_guard_(b, "el_parser_level_comment_directive_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // "%populate"
  static boolean el_populate_directive(PsiBuilder b, int l) {
    return consumeTokenFast(b, EL_POPULATE);
  }

  /* ********************************************************** */
  // el_literal_expr | el_id_expr | el_paren_expr
  public static boolean el_primary_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_primary_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EL_PRIMARY_EXPR, "<el primary expr>");
    r = el_literal_expr(b, l + 1);
    if (!r) r = el_id_expr(b, l + 1);
    if (!r) r = el_paren_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // el_static_member_access
  public static boolean el_static_field_access_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_static_field_access_expr")) return false;
    if (!nextTokenIsFast(b, EL_AT_SIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = el_static_member_access(b, l + 1);
    exit_section_(b, m, EL_STATIC_FIELD_ACCESS_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // el_class_ref el_id_expr
  static boolean el_static_member_access(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_static_member_access")) return false;
    if (!nextTokenIs(b, EL_AT_SIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = el_class_ref(b, l + 1);
    r = r && el_id_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // el_static_member_access el_parameters
  public static boolean el_static_method_call_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_static_method_call_expr")) return false;
    if (!nextTokenIsFast(b, EL_AT_SIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = el_static_member_access(b, l + 1);
    r = r && el_parameters(b, l + 1);
    exit_section_(b, m, EL_STATIC_METHOD_CALL_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // el_factor_expr "-" el_factor_expr
  public static boolean el_subtract_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_subtract_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EL_SUBTRACT_EXPR, "<el subtract expr>");
    r = el_factor_expr(b, l + 1);
    r = r && consumeToken(b, EL_MINUS);
    r = r && el_factor_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // comment | literal | word | OTHER
  static boolean item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item")) return false;
    boolean r;
    r = comment(b, l + 1);
    if (!r) r = literal(b, l + 1);
    if (!r) r = word(b, l + 1);
    if (!r) r = consumeToken(b, OTHER);
    return r;
  }

  /* ********************************************************** */
  // STRING | NUMBER
  static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    if (!nextTokenIsFast(b, NUMBER, STRING)) return false;
    boolean r;
    r = consumeTokenFast(b, STRING);
    if (!r) r = consumeTokenFast(b, NUMBER);
    return r;
  }

  /* ********************************************************** */
  // content *
  static boolean sql_file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sql_file")) return false;
    while (true) {
      int c = current_position_(b);
      if (!content(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sql_file", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KEYWORD | WORD
  static boolean word(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "word")) return false;
    if (!nextTokenIsFast(b, KEYWORD, WORD)) return false;
    boolean r;
    r = consumeTokenFast(b, KEYWORD);
    if (!r) r = consumeTokenFast(b, WORD);
    return r;
  }

  /* ********************************************************** */
  // Expression root: el_expr
  // Operator priority table:
  // 0: ATOM(el_not_expr) BINARY(el_and_expr) BINARY(el_or_expr)
  // 1: ATOM(el_term_expr)
  public static boolean el_expr(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "el_expr")) return false;
    addVariant(b, "<el expr>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<el expr>");
    r = el_not_expr(b, l + 1);
    if (!r) r = el_term_expr(b, l + 1);
    p = r;
    r = r && el_expr_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean el_expr_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "el_expr_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && consumeTokenSmart(b, EL_AND)) {
        r = el_expr(b, l, 0);
        exit_section_(b, l, m, EL_AND_EXPR, r, true, null);
      }
      else if (g < 0 && consumeTokenSmart(b, EL_OR)) {
        r = el_expr(b, l, 0);
        exit_section_(b, l, m, EL_OR_EXPR, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // "!" el_factor_expr
  public static boolean el_not_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_not_expr")) return false;
    if (!nextTokenIsSmart(b, EL_NOT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EL_NOT_EXPR, null);
    r = consumeTokenSmart(b, EL_NOT);
    p = r; // pin = 1
    r = r && el_factor_expr(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // el_comparison_expr_group | el_arithmetic_expr_group | el_factor_expr
  public static boolean el_term_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "el_term_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EL_TERM_EXPR, "<el term expr>");
    r = el_comparison_expr_group(b, l + 1);
    if (!r) r = el_arithmetic_expr_group(b, l + 1);
    if (!r) r = el_factor_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}

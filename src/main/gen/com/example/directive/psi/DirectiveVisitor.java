// This is a generated file. Not intended for manual editing.
package com.example.directive.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class DirectiveVisitor extends PsiElementVisitor {

  public void visitAndExpr(@NotNull DirectiveAndExpr o) {
    visitExpr(o);
  }

  public void visitBindVariableDirective(@NotNull DirectiveBindVariableDirective o) {
    visitPsiElement(o);
  }

  public void visitElseDirective(@NotNull DirectiveElseDirective o) {
    visitPsiElement(o);
  }

  public void visitElseifDirective(@NotNull DirectiveElseifDirective o) {
    visitPsiElement(o);
  }

  public void visitEmbeddedVariableDirective(@NotNull DirectiveEmbeddedVariableDirective o) {
    visitPsiElement(o);
  }

  public void visitEndDirective(@NotNull DirectiveEndDirective o) {
    visitPsiElement(o);
  }

  public void visitEqExpr(@NotNull DirectiveEqExpr o) {
    visitExpr(o);
  }

  public void visitExpandDirective(@NotNull DirectiveExpandDirective o) {
    visitPsiElement(o);
  }

  public void visitExpr(@NotNull DirectiveExpr o) {
    visitPsiElement(o);
  }

  public void visitFieldExpr(@NotNull DirectiveFieldExpr o) {
    visitExpr(o);
  }

  public void visitForDirective(@NotNull DirectiveForDirective o) {
    visitPsiElement(o);
  }

  public void visitFunctionExpr(@NotNull DirectiveFunctionExpr o) {
    visitExpr(o);
  }

  public void visitGeExpr(@NotNull DirectiveGeExpr o) {
    visitExpr(o);
  }

  public void visitGtExpr(@NotNull DirectiveGtExpr o) {
    visitExpr(o);
  }

  public void visitIdExpr(@NotNull DirectiveIdExpr o) {
    visitExpr(o);
  }

  public void visitIfDirective(@NotNull DirectiveIfDirective o) {
    visitPsiElement(o);
  }

  public void visitLeExpr(@NotNull DirectiveLeExpr o) {
    visitExpr(o);
  }

  public void visitLiteralExpr(@NotNull DirectiveLiteralExpr o) {
    visitExpr(o);
  }

  public void visitLiteralVariableDirective(@NotNull DirectiveLiteralVariableDirective o) {
    visitPsiElement(o);
  }

  public void visitLtExpr(@NotNull DirectiveLtExpr o) {
    visitExpr(o);
  }

  public void visitMethodExpr(@NotNull DirectiveMethodExpr o) {
    visitExpr(o);
  }

  public void visitNeExpr(@NotNull DirectiveNeExpr o) {
    visitExpr(o);
  }

  public void visitNotExpr(@NotNull DirectiveNotExpr o) {
    visitExpr(o);
  }

  public void visitOrExpr(@NotNull DirectiveOrExpr o) {
    visitExpr(o);
  }

  public void visitParenExpr(@NotNull DirectiveParenExpr o) {
    visitExpr(o);
  }

  public void visitPopulateDirective(@NotNull DirectivePopulateDirective o) {
    visitPsiElement(o);
  }

  public void visitStaticFieldExpr(@NotNull DirectiveStaticFieldExpr o) {
    visitExpr(o);
  }

  public void visitStaticMethodExpr(@NotNull DirectiveStaticMethodExpr o) {
    visitExpr(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}

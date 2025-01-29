// This is a generated file. Not intended for manual editing.
package com.example.sql.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class SqlVisitor extends PsiElementVisitor {

  public void visitElAddExpr(@NotNull SqlElAddExpr o) {
    visitElExpr(o);
  }

  public void visitElAndExpr(@NotNull SqlElAndExpr o) {
    visitElExpr(o);
  }

  public void visitElDivideExpr(@NotNull SqlElDivideExpr o) {
    visitElExpr(o);
  }

  public void visitElEqExpr(@NotNull SqlElEqExpr o) {
    visitElExpr(o);
  }

  public void visitElExpr(@NotNull SqlElExpr o) {
    visitPsiElement(o);
  }

  public void visitElFactorExpr(@NotNull SqlElFactorExpr o) {
    visitElTermExpr(o);
  }

  public void visitElFieldAccessExpr(@NotNull SqlElFieldAccessExpr o) {
    visitElExpr(o);
  }

  public void visitElFunctionCallExpr(@NotNull SqlElFunctionCallExpr o) {
    visitElExpr(o);
  }

  public void visitElGeExpr(@NotNull SqlElGeExpr o) {
    visitElExpr(o);
  }

  public void visitElGtExpr(@NotNull SqlElGtExpr o) {
    visitElExpr(o);
  }

  public void visitElLeExpr(@NotNull SqlElLeExpr o) {
    visitElExpr(o);
  }

  public void visitElLtExpr(@NotNull SqlElLtExpr o) {
    visitElExpr(o);
  }

  public void visitElMethodCallExpr(@NotNull SqlElMethodCallExpr o) {
    visitElExpr(o);
  }

  public void visitElModExpr(@NotNull SqlElModExpr o) {
    visitElExpr(o);
  }

  public void visitElMultiplyExpr(@NotNull SqlElMultiplyExpr o) {
    visitElExpr(o);
  }

  public void visitElNeExpr(@NotNull SqlElNeExpr o) {
    visitElExpr(o);
  }

  public void visitElNewExpr(@NotNull SqlElNewExpr o) {
    visitElExpr(o);
  }

  public void visitElNotExpr(@NotNull SqlElNotExpr o) {
    visitElExpr(o);
  }

  public void visitElOrExpr(@NotNull SqlElOrExpr o) {
    visitElExpr(o);
  }

  public void visitElPrimaryExpr(@NotNull SqlElPrimaryExpr o) {
    visitElFactorExpr(o);
  }

  public void visitElStaticFieldAccessExpr(@NotNull SqlElStaticFieldAccessExpr o) {
    visitElExpr(o);
  }

  public void visitElStaticMethodCallExpr(@NotNull SqlElStaticMethodCallExpr o) {
    visitElExpr(o);
  }

  public void visitElSubtractExpr(@NotNull SqlElSubtractExpr o) {
    visitElExpr(o);
  }

  public void visitElTermExpr(@NotNull SqlElTermExpr o) {
    visitElExpr(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}

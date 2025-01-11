// This is a generated file. Not intended for manual editing.
package com.example.sql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.example.sql.psi.SqlTypes.*;
import com.example.sql.psi.*;

public class SqlElLiteralExprImpl extends SqlElExprImpl implements SqlElLiteralExpr {

  public SqlElLiteralExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitElLiteralExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getElBoolean() {
    return findChildByType(EL_BOOLEAN);
  }

  @Override
  @Nullable
  public PsiElement getElChar() {
    return findChildByType(EL_CHAR);
  }

  @Override
  @Nullable
  public PsiElement getElNumber() {
    return findChildByType(EL_NUMBER);
  }

  @Override
  @Nullable
  public PsiElement getElString() {
    return findChildByType(EL_STRING);
  }

}

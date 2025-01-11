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

public class SqlElNeExprImpl extends SqlElExprImpl implements SqlElNeExpr {

  public SqlElNeExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitElNeExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SqlElExpr> getElExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SqlElExpr.class);
  }

}

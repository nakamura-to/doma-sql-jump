// This is a generated file. Not intended for manual editing.
package com.example.sql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.example.sql.psi.SqlTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.example.sql.psi.*;

public class SqlElIfDirectiveImpl extends ASTWrapperPsiElement implements SqlElIfDirective {

  public SqlElIfDirectiveImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitElIfDirective(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SqlElExpr getElExpr() {
    return findNotNullChildByClass(SqlElExpr.class);
  }

}

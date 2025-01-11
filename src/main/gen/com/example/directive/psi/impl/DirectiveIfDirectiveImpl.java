// This is a generated file. Not intended for manual editing.
package com.example.directive.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.example.directive.psi.DirectiveTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.example.directive.psi.*;

public class DirectiveIfDirectiveImpl extends ASTWrapperPsiElement implements DirectiveIfDirective {

  public DirectiveIfDirectiveImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DirectiveVisitor visitor) {
    visitor.visitIfDirective(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DirectiveVisitor) accept((DirectiveVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DirectiveExpr getExpr() {
    return findNotNullChildByClass(DirectiveExpr.class);
  }

}

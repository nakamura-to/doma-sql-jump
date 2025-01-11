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

public class SqlElParserLevelCommentDirectiveImpl extends ASTWrapperPsiElement implements SqlElParserLevelCommentDirective {

  public SqlElParserLevelCommentDirectiveImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitElParserLevelCommentDirective(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

}

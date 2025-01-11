package com.example.sql.psi.impl;

import com.example.sql.psi.BlockCommentElement;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public class BlockCommentElementImpl extends ASTWrapperPsiElement implements BlockCommentElement {
    public BlockCommentElementImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public @NotNull IElementType getTokenType() {
        return getNode().getElementType();
    }
}

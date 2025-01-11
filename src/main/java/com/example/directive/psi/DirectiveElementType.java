package com.example.directive.psi;

import com.example.directive.DirectiveLanguage;
import com.example.sql.SqlLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class DirectiveElementType extends IElementType {

    public DirectiveElementType(@NotNull @NonNls String debugName) {
        super(debugName, DirectiveLanguage.INSTANCE);
    }

}

package com.example.sql.psi;

import com.example.sql.SqlLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class SqlTokenType extends IElementType {

    public SqlTokenType(@NotNull @NonNls String debugName) {
        super(debugName, SqlLanguage.INSTANCE);
    }
}
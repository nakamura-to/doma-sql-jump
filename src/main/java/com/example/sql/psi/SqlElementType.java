package com.example.sql.psi;

import com.example.sql.SqlLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class SqlElementType extends IElementType {

    public SqlElementType(@NotNull @NonNls String debugName) {
        super(debugName, SqlLanguage.INSTANCE);
    }
}

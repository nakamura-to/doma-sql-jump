package com.example.sql;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public final class SqlFileType extends LanguageFileType {

    public static final SqlFileType INSTANCE = new SqlFileType();

    private SqlFileType() {
        super(SqlLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Sql File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Sql language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "sql";
    }

    @Override
    public Icon getIcon() {
        return null;
    }

}
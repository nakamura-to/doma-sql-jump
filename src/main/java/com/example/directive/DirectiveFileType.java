package com.example.directive;

import com.example.sql.SqlLanguage;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public final class DirectiveFileType extends LanguageFileType {

    public static final DirectiveFileType INSTANCE = new DirectiveFileType();

    private DirectiveFileType() {
        super(DirectiveLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Directive File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Directive language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "directive";
    }

    @Override
    public Icon getIcon() {
        return null;
    }

}
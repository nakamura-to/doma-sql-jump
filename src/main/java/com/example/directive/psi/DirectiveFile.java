package com.example.directive.psi;

import com.example.directive.DirectiveFileType;
import com.example.directive.DirectiveLanguage;
import com.example.sql.SqlFileType;
import com.example.sql.SqlLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class DirectiveFile extends PsiFileBase {

    public DirectiveFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, DirectiveLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return DirectiveFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Directive File";
    }

}

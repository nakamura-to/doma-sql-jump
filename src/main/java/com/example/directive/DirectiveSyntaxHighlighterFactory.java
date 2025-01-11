package com.example.directive;

import com.example.sql.SqlSyntaxHighlighter;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

public class DirectiveSyntaxHighlighterFactory extends SyntaxHighlighterFactory {

    @Override
    public @NotNull SyntaxHighlighter getSyntaxHighlighter(Project project, VirtualFile virtualFile) {
        return new DirectiveSyntaxHighlighter();
    }
}
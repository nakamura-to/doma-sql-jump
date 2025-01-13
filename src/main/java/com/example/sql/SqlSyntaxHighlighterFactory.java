package com.example.sql;

import com.intellij.lang.Language;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class SqlSyntaxHighlighterFactory extends SyntaxHighlighterFactory {

    private static final Map<IElementType, TextAttributesKey> map = new HashMap<>();

    @Override
    public @NotNull SyntaxHighlighter getSyntaxHighlighter(Project project, VirtualFile virtualFile) {
        // TODO
        Language language = Language.findLanguageByID("SQL");
        if (language != null) {
            return SyntaxHighlighterFactory.getSyntaxHighlighter(language, project, virtualFile);
        }
        return new SqlSyntaxHighlighter();
    }
}
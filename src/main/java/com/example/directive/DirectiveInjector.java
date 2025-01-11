package com.example.directive;

import com.example.sql.psi.LineCommentElement;
import com.intellij.lang.injection.general.Injection;
import com.intellij.lang.injection.general.LanguageInjectionContributor;
import com.intellij.lang.injection.general.SimpleInjection;
import com.intellij.psi.PsiAnnotation;
import com.intellij.psi.PsiComment;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DirectiveInjector implements LanguageInjectionContributor {
    @Override
    public @Nullable Injection getInjection(@NotNull PsiElement context) {
        if (shouldInject(context)) {
            return new SimpleInjection(DirectiveLanguage.INSTANCE, "", "", null);
        }
        return null;
    }

    private boolean shouldInject(PsiElement element) {
        PsiComment comment = element instanceof PsiComment ? (PsiComment) element : null;
        if (comment == null) {
            return false;
        }
        if (comment instanceof LineCommentElement) {
            return false;
        }
        String text = comment.getText();
        if (text != null && text.length() > 3 && text.startsWith("/*")) {
            char c = text.charAt(2);
            return c == '%' || c == '#' || c == '^' || c == '@' || c == '"' || c == '\'' || Character.isJavaIdentifierStart(c) || Character.isWhitespace(c);
        }
        return false;
    }
}

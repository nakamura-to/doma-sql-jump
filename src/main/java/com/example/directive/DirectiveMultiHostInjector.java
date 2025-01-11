package com.example.directive;

import com.example.sql.SqlLanguage;
import com.example.sql.psi.BlockCommentElement;
import com.example.sql.psi.LineCommentElement;
import com.intellij.lang.injection.InjectedLanguageManager;
import com.intellij.lang.injection.MultiHostInjector;
import com.intellij.lang.injection.MultiHostRegistrar;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class DirectiveMultiHostInjector implements MultiHostInjector {
    @Override
    public void getLanguagesToInject(@NotNull MultiHostRegistrar registrar, @NotNull PsiElement context) {
        if (isBlockComment(context)) {
            String text = context.getText().substring(2, context.getText().length() - 2);
            registrar.startInjecting(DirectiveLanguage.INSTANCE);
            registrar.addPlace(null, null, (PsiLanguageInjectionHost) context, new TextRange(2, text.length() + 2))
                    .doneInjecting();
        } else if (context instanceof PsiLiteralExpression expression) {
            if (expression != null) {
                String text = expression.getText();
                if (text != null) {
                    // TODO
                    registrar.startInjecting(SqlLanguage.INSTANCE, "sql").
                            addPlace(null, null, (PsiLanguageInjectionHost) expression, new TextRange(1, text.length() - 1))
                            .doneInjecting();

                    InjectedLanguageManager injectedLanguageManager = InjectedLanguageManager.getInstance(expression.getProject());

                    // 注入された要素を取得し、新しい構造上で探索を再続行
                    var injectedPsiFiles = injectedLanguageManager.getInjectedPsiFiles(expression);
                    if (injectedPsiFiles == null) {
                        return;
                    }
                }
            }
        }
    }

    @Override
    public @NotNull List<? extends Class<? extends PsiElement>> elementsToInjectIn() {
        return List.of(PsiLanguageInjectionHost.class);
    }

    private boolean isBlockComment(PsiElement element) {
        PsiComment comment = element instanceof PsiComment ? (PsiComment) element : null;
        if (comment == null) {
            return false;
        }
        if (comment instanceof LineCommentElement) {
            return false;
        }
        String text = comment.getText();
        if (text != null && text.length() > 5 && text.startsWith("/*")) {
            char c = text.charAt(2);
            return c == '%' || c == '#' || c == '^' || c == '@' || c == '"' || c == '\'' || Character.isJavaIdentifierStart(c) || Character.isWhitespace(c);
        }
        return false;
    }

    private boolean isAnnotation(PsiElement element) {
        PsiAnnotation annotation = element instanceof PsiAnnotation ? (PsiAnnotation) element : null;
        return annotation != null;
    }

}

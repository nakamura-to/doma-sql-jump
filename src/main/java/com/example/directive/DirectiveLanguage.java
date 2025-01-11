package com.example.directive;

import com.intellij.lang.Language;

public class DirectiveLanguage extends Language {

    public static final DirectiveLanguage INSTANCE = new DirectiveLanguage();

    private DirectiveLanguage() {
        super("SqlTemplateDirective");
    }
}
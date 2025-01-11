package com.example.directive;

import com.intellij.lexer.FlexAdapter;

public class DirectiveLexerAdapter extends FlexAdapter {

    public DirectiveLexerAdapter() {
        super(new DirectiveLexer(null));
    }

}

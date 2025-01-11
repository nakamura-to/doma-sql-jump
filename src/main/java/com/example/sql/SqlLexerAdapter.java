package com.example.sql;

import com.intellij.lexer.FlexAdapter;

public class SqlLexerAdapter extends FlexAdapter {

    public SqlLexerAdapter() {
        super(new SqlLexer(null));
    }

}

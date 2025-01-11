package com.example.sql;

import com.intellij.lang.Language;

public class SqlLanguage extends Language {

    public static final SqlLanguage INSTANCE = new SqlLanguage();

    private SqlLanguage() {
        super("SqlTemplate");
    }
}
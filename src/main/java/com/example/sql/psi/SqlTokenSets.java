package com.example.sql.psi;

import com.example.sql.SqlFileType;
import com.intellij.psi.tree.TokenSet;

public interface SqlTokenSets {
    TokenSet COMMENTS = TokenSet.create(SqlTypes.BLOCK_COMMENT_CONTENT, SqlTypes.LINE_COMMENT);
}

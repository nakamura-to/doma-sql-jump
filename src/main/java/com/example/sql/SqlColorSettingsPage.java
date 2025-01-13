package com.example.sql;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

final class SqlColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Identifier", SqlSyntaxHighlighter.EL_IDENTIFIER),
            new AttributesDescriptor("DirectiveName//If", SqlSyntaxHighlighter.EL_IF),
            new AttributesDescriptor("DirectiveName//For", SqlSyntaxHighlighter.EL_FOR),
            new AttributesDescriptor("DirectiveName//End", SqlSyntaxHighlighter.EL_END),
    };

    @Override
    public Icon getIcon() {
        // TODO
        return null;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new SqlSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return """
                select * from employee where
                /* %for name : names */
                employee_name like /* name */'hoge'
                  /*%if name_has_next */
                /*# @isEmpty() */
                  /*%end */
                /*%end*/
                or
                salary > 1000
                """;
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "SqlTemplateDirective";
    }

}
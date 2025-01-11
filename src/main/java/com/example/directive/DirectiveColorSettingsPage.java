package com.example.directive;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

final class DirectiveColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Identifier", DirectiveSyntaxHighlighter.IDENTIFIER),
            new AttributesDescriptor("DirectiveName//If", DirectiveSyntaxHighlighter.IF),
            new AttributesDescriptor("DirectiveName//For", DirectiveSyntaxHighlighter.FOR),
            new AttributesDescriptor("DirectiveName//End", DirectiveSyntaxHighlighter.END)
    };

    @Override
    public Icon getIcon() {
        // TODO
        return null;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new DirectiveSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return """
                %if entity != null && entity.name != null && entity.name.length() > 0

                %end
                
                %for name in names
                
                @isEmpty(entity.name)
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
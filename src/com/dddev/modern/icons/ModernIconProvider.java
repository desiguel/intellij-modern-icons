package com.dddev.modern.icons;

import com.intellij.ide.IconProvider;
import com.intellij.openapi.util.IconLoader;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class ModernIconProvider extends IconProvider {

    private static final String ICON_CFILE = "/file-icons/file_type_c.png";
    private static final String ICON_CPPFILE = "/file-icons/file_type_c++.png";
    private static final String ICON_CSHARP = "/file-icons/file_type_c#.png";
    private static final String ICON_RUST = "/file-icons/file_type_rust.png";
    private static final String ICON_HASKELL = "/file-icons/file_type_haskell.png";
    private static final String ICON_JAVA = "/file-icons/file_type_java.png";
    private static final String ICON_PHP = "/file-icons/file_type_php.png";
    private static final String ICON_RUBY = "/file-icons/file_type_ruby.png";
    private static final String ICON_PYTHON = "/file-icons/file_type_python.png";
    private static final String ICON_JAVASCRIPT = "/file-icons/file_type_js.png";
    private static final String ICON_TYPESCRIPT = "/file-icons/file_type_ts.png";
    private static final String ICON_COFFEESCRIPT = "/file-icons/file_type_coffeescript.png";
    private static final String ICON_CFILE_TEST = "/file-icons/file_type_c_test.png";
    private static final String ICON_CPPFILE_TEST = "/file-icons/file_type_c++_test.png";
    private static final String ICON_CSHARP_TEST = "/file-icons/file_type_c#_test.png";
    private static final String ICON_RUST_TEST = "/file-icons/file_type_rust_test.png";
    private static final String ICON_HASKELL_TEST = "/file-icons/file_type_haskell_test.png";
    private static final String ICON_JAVA_TEST = "/file-icons/file_type_java_test.png";
    private static final String ICON_PHP_TEST = "/file-icons/file_type_php_test.png";
    private static final String ICON_RUBY_TEST = "/file-icons/file_type_ruby_test.png";
    private static final String ICON_PYTHON_TEST = "/file-icons/file_type_python_test.png";
    private static final String ICON_JAVASCRIPT_TEST = "/file-icons/file_type_js_test.png";
    private static final String ICON_TYPESCRIPT_TEST = "/file-icons/file_type_ts_test.png";
    private static final String ICON_COFFEESCRIPT_TEST = "/file-icons/file_type_coffeescript_test.png";
    private static final String ICON_REACT = "/file-icons/file_type_react.png";
    private static final String ICON_SWIFT = "/file-icons/file_type_swift.png";
    private static final String ICON_MFILE = "/file-icons/file_type_objectivec.png";
    private static final String ICON_HEADER = "/file-icons/file_type_header.png";
    private static final String ICON_VUE = "/file-icons/file_type_vue.png";
    private static final String ICON_SHELL = "/file-icons/file_type_source.png";
    private static final String ICON_MARKDOWN = "/file-icons/file_type_markdown.png";
    private static final String ICON_GIT = "/file-icons/file_type_git.png";
    private static final String ICON_FONT = "/file-icons/file_type_font.png";
    private static final String ICON_HTML = "/file-icons/file_type_html.png";
    private static final String ICON_CSS = "/file-icons/file_type_css.png";
    private static final String ICON_SCSS = "/file-icons/file_type_scss.png";
    private static final String ICON_JADE = "/file-icons/file_type_jade.png";
    private static final String ICON_XML = "/file-icons/file_type_markup.png";
    private static final String ICON_JSON = "/file-icons/file_type_settings.png";
    private static final String ICON_YAML = "/file-icons/file_type_yaml.png";
    private static final String ICON_GRUNT = "/file-icons/file_type_gruntfile.png";
    private static final String ICON_GULP = "/file-icons/file_type_gulpfile.png";
    private static final String ICON_BOWER = "/file-icons/file_type_bower.png";
    private static final String ICON_NPM = "/file-icons/file_type_npm.png";
    private static final String ICON_TEX = "/file-icons/file_type_tex.png";
    private static final String ICON_TEXT = "/file-icons/file_type_text.png";
    private static final String ICON_IMAGE = "/file-icons/file_type_image.png";
    private static final String ICON_SQL = "/file-icons/file_type_sql.png";
    private static final String ICON_SCALA = "/file-icons/file_type_scala.png";
    private static final String ICON_PROTRACTOR = "/file-icons/file_type_protractor.png";

    public Icon getIcon(@NotNull PsiElement psiElement, int flags) {

        PsiFile containingFile = psiElement.getContainingFile();

        if (containingFile != null) {

            String filename = containingFile.getName().toLowerCase();

            if (filename.equals("package.json")) {
                return IconLoader.getIcon(ICON_NPM);
            } else if (filename.contains("grunt")) {
                return IconLoader.getIcon(ICON_GRUNT);
            } else if (filename.contains("gulp")) {
                return IconLoader.getIcon(ICON_GULP);
            } else if (filename.contains("protractor")) {
                return IconLoader.getIcon(ICON_PROTRACTOR);
            } else if (filename.endsWith(".coffee")) {
                return IconLoader.getIcon(ICON_COFFEESCRIPT);
            } else if (filename.endsWith("-test.coffee")) {
                return IconLoader.getIcon(ICON_COFFEESCRIPT_TEST);
            } else if (filename.endsWith(".c")) {
                return IconLoader.getIcon(ICON_CFILE);
            } else if (filename.endsWith("-test.c")) {
                return IconLoader.getIcon(ICON_CFILE_TEST);
            } else if (filename.endsWith(".c++")) {
                return IconLoader.getIcon(ICON_CPPFILE);
            } else if (filename.endsWith("-test.c++")) {
                return IconLoader.getIcon(ICON_CPPFILE_TEST);
            } else if (filename.endsWith(".c#")) {
                return IconLoader.getIcon(ICON_CSHARP);
            } else if (filename.endsWith("-test.c#")) {
                return IconLoader.getIcon(ICON_CSHARP_TEST);
            } else if (filename.endsWith(".rs")) {
                return IconLoader.getIcon(ICON_RUST);
            } else if (filename.endsWith("-test.rs")) {
                return IconLoader.getIcon(ICON_RUST_TEST);
            } else if (filename.endsWith(".hs")) {
                return IconLoader.getIcon(ICON_HASKELL);
            } else if (filename.endsWith("-test.hs")) {
                return IconLoader.getIcon(ICON_HASKELL_TEST);
            } else if (filename.endsWith(".java")) {
                return IconLoader.getIcon(ICON_JAVA);
            } else if (filename.endsWith("-test.java")) {
                return IconLoader.getIcon(ICON_JAVA_TEST);
            } else if (filename.endsWith(".rb")) {
                return IconLoader.getIcon(ICON_RUBY);
            } else if (filename.endsWith("-test.rb")) {
                return IconLoader.getIcon(ICON_RUBY_TEST);
            } else if (filename.endsWith(".php")) {
                return IconLoader.getIcon(ICON_PHP);
            } else if (filename.endsWith("-test.php")) {
                return IconLoader.getIcon(ICON_PHP_TEST);
            } else if (filename.endsWith(".py")) {
                return IconLoader.getIcon(ICON_PYTHON);
            } else if (filename.endsWith("-test.py")) {
                return IconLoader.getIcon(ICON_PYTHON_TEST);
            } else if (filename.endsWith(".js")) {
                return IconLoader.getIcon(ICON_JAVASCRIPT);
            } else if (filename.endsWith("-test.js")) {
                return IconLoader.getIcon(ICON_JAVASCRIPT_TEST);
            } else if (filename.endsWith(".ts")) {
                return IconLoader.getIcon(ICON_TYPESCRIPT);
            } else if (filename.endsWith("-test.ts")) {
                return IconLoader.getIcon(ICON_TYPESCRIPT_TEST);
            } else if (filename.endsWith("spec.ts")) {
                return IconLoader.getIcon(ICON_TYPESCRIPT_TEST);
            } else if (filename.contains(".git")) {
                return IconLoader.getIcon(ICON_GIT);
            } else if (filename.endsWith(".html")) {
                return IconLoader.getIcon(ICON_HTML);
            } else if (filename.endsWith(".jade")) {
                return IconLoader.getIcon(ICON_JADE);
            } else if (filename.endsWith(".jsx")) {
                return IconLoader.getIcon(ICON_REACT);
            } else if (filename.endsWith(".swift")) {
                return IconLoader.getIcon(ICON_SWIFT);
            } else if (filename.endsWith(".sql")) {
                return IconLoader.getIcon(ICON_SQL);
            } else if (filename.endsWith(".make")) {
                return IconLoader.getIcon(ICON_MFILE);
            } else if (filename.endsWith(".md")) {
                return IconLoader.getIcon(ICON_MARKDOWN);
            } else if (filename.endsWith(".json")) {
                return IconLoader.getIcon(ICON_JSON);
            } else if (filename.endsWith(".h")) {
                return IconLoader.getIcon(ICON_HEADER);
            } else if (filename.endsWith(".txt")) {
                return IconLoader.getIcon(ICON_TEXT);
            } else if (filename.endsWith(".css")) {
                return IconLoader.getIcon(ICON_CSS);
            } else if (filename.endsWith(".scss")) {
                return IconLoader.getIcon(ICON_SCSS);
            } else if (filename.endsWith(".vue")) {
                return IconLoader.getIcon(ICON_VUE);
            } else if (filename.endsWith(".xml")) {
                return IconLoader.getIcon(ICON_XML);
            } else if (filename.endsWith(".sh")) {
                return IconLoader.getIcon(ICON_SHELL);
            } else if (filename.endsWith(".yaml")) {
                return IconLoader.getIcon(ICON_YAML);
            } else if (filename.endsWith(".yml")) {
                return IconLoader.getIcon(ICON_YAML);
            } else if (filename.endsWith(".tex")) {
                return IconLoader.getIcon(ICON_TEX);
            } else if (filename.endsWith(".otf")) {
                return IconLoader.getIcon(ICON_FONT);
            } else if (filename.endsWith(".ttf")) {
                return IconLoader.getIcon(ICON_FONT);
            } else if (filename.endsWith(".png")) {
                return IconLoader.getIcon(ICON_IMAGE);
            } else if (filename.endsWith(".jpg")) {
                return IconLoader.getIcon(ICON_IMAGE);
            } else if (filename.endsWith(".ico")) {
                return IconLoader.getIcon(ICON_IMAGE);
            } else if (filename.endsWith(".gif")) {
                return IconLoader.getIcon(ICON_IMAGE);
            } else if (filename.endsWith(".scss")) {
                return IconLoader.getIcon(ICON_SCSS);
            } else if (filename.contains("bower")) {
                return IconLoader.getIcon(ICON_BOWER);
            } else if (filename.endsWith(".scala")) {
                return IconLoader.getIcon(ICON_SCALA);
            }

        }

        return null;
    }
}

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.kit.utils;

import lombok.NonNull;

import java.util.Locale;

public class LanguageKit {

    /**
     * 是否是中文
     */
    public boolean isZhCN(@NonNull String language) {
        Locale china = Locale.CHINA;
        return language.equals(china.getLanguage());
    }
}

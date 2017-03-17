package org.oca.chapter13.locale;

import java.util.Arrays;
import java.util.Locale;

/**
 * Created by mx on 11/3/2017.
 */
public class AvailableLocalesEnglish {

    public static void main(String[] args) {
        Arrays.stream(Locale.getAvailableLocales())
                .filter(locale -> locale.getLanguage().equals("es"))
                .forEach(locale -> {
                    System.out.printf("Locale code: %s and it stands for %s %n", locale, locale.getDisplayName());
                });
    }

}

package org.oca.chapter13.locale;

import java.time.LocalDate;
import java.util.Locale;

/**
 * Created by mx on 11/3/2017.
 */
public class LocaleDetails {

    public static void main(String[] args) {
        Locale.setDefault(Locale.CANADA_FRENCH);
        Locale defaultLocale = Locale.getDefault();

        System.out.printf("The default locale is: %s", defaultLocale.getDisplayName());
        System.out.printf("%nThe default country is: %s", defaultLocale.getCountry());
        System.out.printf("%nThe default display country is: %s", defaultLocale.getDisplayCountry());
        System.out.printf("%nThe default display script is: %s", defaultLocale.getDisplayScript());
        System.out.printf("%nThe default language is: %s", defaultLocale.getLanguage());
        System.out.printf("%nThe default ISO language is: %s", defaultLocale.getISO3Language());
        System.out.printf("%nThe default ISO country is: %s", defaultLocale.getISO3Country());
        System.out.printf("%nThe default display variant is: %s", defaultLocale.getDisplayVariant());

    }
}

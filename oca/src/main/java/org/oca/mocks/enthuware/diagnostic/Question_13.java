package org.oca.mocks.enthuware.diagnostic;

import java.util.Locale;

/**
 * Created by mx on 1/5/2017.
 */
public class Question_13 {

    public static void main(String[] args) {
        printLocale(new Locale("ES", "PE"));
        printLocale(new Locale("EN", "CA"));
        printLocale(new Locale("ES", "CO"));
    }

    private static void printLocale(Locale locale){
        System.out.println(locale);
    }
}

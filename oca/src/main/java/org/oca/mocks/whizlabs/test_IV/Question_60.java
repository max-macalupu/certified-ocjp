package org.oca.mocks.whizlabs.test_IV;

import java.util.Locale;

/**
 * Created by AVANTICA TECHNOLOGIES on 4/18/2017.
 */
public class Question_60 {

    public static void main(String[] args) {
        processTHisAwesomeMethod();
    }

    private static void processTHisAwesomeMethod(){
        Locale locale = new Locale.Builder().setLanguage("en").setRegion("US").build();
        System.out.println(locale.getDisplayCountry());

        Locale locale2 =Locale.US;
        System.out.println(locale2.getDisplayCountry());
    }
}

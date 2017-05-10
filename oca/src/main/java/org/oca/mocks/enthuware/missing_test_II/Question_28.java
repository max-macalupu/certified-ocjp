package org.oca.mocks.enthuware.missing_test_II;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_28 {
    public static void main(String[] args) {
        Locale l = Locale.getDefault();
        DateFormat df = DateFormat.getDateInstance();
        System.out.println( l.getCountry()+ " " +df.format(new Date()));
    }
}

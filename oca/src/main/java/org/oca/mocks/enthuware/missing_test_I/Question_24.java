package org.oca.mocks.enthuware.missing_test_I;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_24 {
    public static void main(String[] args) {
        Date d = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.UK);
        System.out.println(df.format(d));
    }
}

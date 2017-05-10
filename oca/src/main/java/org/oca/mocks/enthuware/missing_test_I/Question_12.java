package org.oca.mocks.enthuware.missing_test_I;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_12 {
    public static void main(String[] args) {
        Date d = new Date();
        DateFormat  df = DateFormat.getDateInstance(DateFormat.LONG);
//        df.setLocale
        String s = df.format(d);
        System.out.println(s);
    }
}

package org.oca.mocks.enthuware.test_I;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by mx on 1/5/2017.
 */
public class Question_44 {
    public static void main(String[] args) {
        processThis();
    }

    private static void processThis(){
        Date d = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.DEFAULT ,Locale.GERMANY);
        String s = df.format(d);
        System.out.println(s);
    }
}

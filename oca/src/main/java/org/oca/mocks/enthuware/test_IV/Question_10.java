package org.oca.mocks.enthuware.test_IV;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Created by mx on 8/5/2017.
 */
public class Question_10 {
    public static void main(String[] args) throws ParseException {
        double amount = 105.39;
        Locale localeFr = new Locale("fr","FR");
        NumberFormat numberFormat = NumberFormat.getInstance(localeFr);
        String s = numberFormat.format(amount);
        numberFormat = NumberFormat.getInstance();
        Number number = numberFormat.parse(s);
        System.out.println(number+ " " + s);
    }
}

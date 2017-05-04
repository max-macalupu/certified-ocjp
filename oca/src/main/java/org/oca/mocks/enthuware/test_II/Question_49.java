package org.oca.mocks.enthuware.test_II;

import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by mx on 3/5/2017.
 */
public class Question_49 {
    public static void main(String[] args) {
        proceessThis();
    }

    private static void proceessThis(){
        double amount  = 1000.54;
        Locale jp = new Locale("jp", "JP");
        Format format = NumberFormat.getCurrencyInstance(jp);
        NumberFormat numberFormat = DecimalFormat.getCurrencyInstance(jp);
        System.out.println(format.format(amount));
        System.out.println(numberFormat.format(amount));
    }
}

package org.oca.mocks.enthuware.missing_test_II;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_17 {
    public static void main(String[] args) {
        double amount = 106.12;
        Locale jp = new Locale("jp","JP");
        Format format = NumberFormat.getCurrencyInstance(jp);
        NumberFormat numberFormat = DecimalFormat.getCurrencyInstance(jp   );
        System.out.println(format.format(amount));
        System.out.println(numberFormat.format(amount));
    }
}

package org.oca.mocks.whizlabs.diagnostic;

import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by mx on 18/3/2017.
 */
public class Question_51 {

    public static void main(String[] args) {
        double amount = 5.4;
        Format format = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(format.format(amount));
    }
}
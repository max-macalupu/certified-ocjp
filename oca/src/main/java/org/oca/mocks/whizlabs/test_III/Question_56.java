package org.oca.mocks.whizlabs.test_III;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Created by mx on 14/4/2017.
 */
public class Question_56 {
    public static void main(String[] args) throws ParseException {
        processThisAwesomeMethodForTheQuestion();
    }

    private static void processThisAwesomeMethodForTheQuestion() throws ParseException {
        double fomatNumber = 1234.1;
        NumberFormat numberFormatFR = NumberFormat.getInstance(Locale.FRANCE);
        NumberFormat numberFormatUK = NumberFormat.getInstance(Locale.UK);
        String frFormat = numberFormatFR.format(fomatNumber);
        Number ukFormat = numberFormatUK.parse(frFormat);
        System.out.println(frFormat + " " + ukFormat);
     }
}

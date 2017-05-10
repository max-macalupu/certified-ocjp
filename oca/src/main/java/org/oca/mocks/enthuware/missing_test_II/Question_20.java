package org.oca.mocks.enthuware.missing_test_II;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_20 {
    public static void main(String[] args) {
        Date d = Calendar.getInstance(Locale.FRANCE).getTime();
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE);
        System.out.println(df.format(d));
    }
}

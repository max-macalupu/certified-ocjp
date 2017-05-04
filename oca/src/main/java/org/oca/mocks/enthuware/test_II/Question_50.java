package org.oca.mocks.enthuware.test_II;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by mx on 3/5/2017.
 */
public class Question_50 {
    public static void main(String[] args) {
        processThis();
    }

    private static void processThis(){
        Date d = Calendar.getInstance(Locale.FRANCE).getTime();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE);
        System.out.println(dateFormat.format(d));
    }
}

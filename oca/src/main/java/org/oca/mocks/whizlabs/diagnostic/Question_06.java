package org.oca.mocks.whizlabs.diagnostic;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by mx on 17/3/2017.
 */
public class Question_06 {

    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT);
        String formatDate = dateFormat.format(date);
        System.out.println(formatDate);

    }

}

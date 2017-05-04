package org.oca.mocks.enthuware.test_II;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * Created by mx on 3/5/2017.
 */
public class Question_43 {
    public static void main(String[] args) {
        processThis();
    }

    private static void processThis(){
        Date d = new Date();
        LocalDate localDate = LocalDate.now();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
//        dateFormat.set
        System.out.println(dateFormat.format(d));
        System.out.println(dateFormat.format(localDate));
    }
}

package org.oca.mocks.enthuware.test_II;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by mx on 3/5/2017.
 */
public class Question_48 {
    public static void main(String[] args) {
        processThis();
    }

    private static void processThis(){
//        LocalDateTime localDateTime = LocalDateTime.parse("1-1-2015");
        LocalDate localDateTime = LocalDate.parse("2015-01-01");
//        String str = localDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        String str = localDateTime.format(DateTimeFormatter.ISO_DATE);
        System.out.println(str);
    }
}

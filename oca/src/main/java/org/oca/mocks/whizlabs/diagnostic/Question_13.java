package org.oca.mocks.whizlabs.diagnostic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by mx on 19/3/2017.
 */
public class Question_13 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1970, 1, 1);
        LocalDate localDate2 = LocalDate.parse("1970-1-1", DateTimeFormatter.ISO_DATE);
        LocalDate localDate3 = LocalDate.now().withDayOfMonth(1).withMonth(1).withYear(1970);
        System.out.println(localDate.toString().equals(localDate2.toString()) && localDate2.toString().equals(localDate3.toString()));
    }
}
package org.oca.mocks.whizlabs.finaltest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by mx on 30/4/2017.
 */
public class Question_48 {
    public static void main(String[] args) {
        process();
    }

    private static void process(){
        LocalDate localDate = LocalDate.of(2025, 3, 9);
        LocalDate localDate2 = LocalDate.of(2025, 3, 9);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d/MM/uuuu");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        System.out.println(dateTimeFormatter.format(localDate) + " " + dateTimeFormatter2.format(localDate2));
        System.out.println(localDate.equals(localDate2));
    }
}

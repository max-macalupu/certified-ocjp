package org.oca.chapter08.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * Created by max.macalupu on 3/1/2017.
 */
public class Question_04{

    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE;
        LocalDate localDate = LocalDate.of(2016, Month.FEBRUARY, 30);
        System.out.printf("The final result is: %s", dateTimeFormatter.format(localDate));

    }

}

package org.oca.chapter08.formating;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * Created by max.macalupu on 2/28/2017.
 */
public class FormatForDate {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println(dateTimeFormatter.format(LocalDate.of(2016, Month.JANUARY, 01)));
    }
}

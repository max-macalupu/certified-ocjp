package org.oca.chapter08.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * Created by max.macalupu on 3/1/2017.
 */
public class Question_01 {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2016, Month.JANUARY, 25);
        System.out.printf("The number of years is: %d", Period.between(LocalDate.now(), localDate).getYears());
    }
}

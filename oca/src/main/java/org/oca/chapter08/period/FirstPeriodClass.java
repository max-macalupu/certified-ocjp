package org.oca.chapter08.period;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * Created by max.macalupu on 2/27/2017.
 */
public class FirstPeriodClass {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2016, Month.APRIL, 1);
        LocalDate expiryDate = LocalDate.of(2018, Month.MARCH, 4);

        Period expiry = Period.between(localDate, expiryDate);

        System.out.printf("This will expiry in: %d years, %d months, %d days %n", expiry.getYears(), expiry.getMonths(), expiry.getDays());
    }
}

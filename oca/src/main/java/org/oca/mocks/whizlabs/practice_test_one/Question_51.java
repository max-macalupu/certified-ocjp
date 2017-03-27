package org.oca.mocks.whizlabs.practice_test_one;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by mx on 26/3/2017.
 */
public class Question_51 {
    public static void main(String[] args) {
        System.out.println(LocalDate.now().withMonth(11).withDayOfMonth(1).with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
        System.out.println(TemporalAdjusters.next(DayOfWeek.TUESDAY).adjustInto(LocalDate.now().withMonth(11).with(TemporalAdjusters.firstDayOfMonth())));
    }
}
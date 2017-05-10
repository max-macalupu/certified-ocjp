package org.oca.mocks.enthuware.final_test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_24 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2015, Month.NOVEMBER, 1, 2, 0);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("US/Eastern"));
        LocalDateTime localDateTime2 = LocalDateTime.of(2015, Month.NOVEMBER, 1, 1, 0);
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(localDateTime2, ZoneId.of("US/Eastern"));
        long hours = ChronoUnit.HOURS.between(zonedDateTime, zonedDateTime2);
        System.out.println(hours);
    }
}
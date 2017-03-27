package org.oca.mocks.whizlabs.practice_test_one;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Created by mx on 26/3/2017.
 */
public class Question_56 {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.of(2017, Month.MARCH, 12, 2, 29), ZoneId.of("US/Pacific"));
        ZonedDateTime zonedDateTimeAfter = ZonedDateTime.of(LocalDateTime.of(2017, Month.MARCH, 12, 3, 0), ZoneId.of("US/Pacific"));
        System.out.println(ChronoUnit.MINUTES.between(zonedDateTime, zonedDateTimeAfter));
    }
}
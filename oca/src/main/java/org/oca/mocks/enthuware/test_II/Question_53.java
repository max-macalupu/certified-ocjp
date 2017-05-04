package org.oca.mocks.enthuware.test_II;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Created by mx on 3/5/2017.
 */
public class Question_53 {
    public static void main(String[] args) {
        processTry();
    }

    private static void processTry(){
        LocalDateTime localDateTime = LocalDateTime.of(2015, Month.MARCH, 8, 2, 0);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("US/Eastern"));
        LocalDateTime localDateTime1 = LocalDateTime.of(2015, Month.MARCH, 8, 3, 0);
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(localDateTime1, ZoneId.of("US/Eastern"));
        long xx = ChronoUnit.HOURS.between(zonedDateTime,zonedDateTime1);
        System.out.println(xx);
    }
}

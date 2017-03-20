package org.oca.mocks.whizlabs.diagnostic;

import java.time.*;

/**
 * Created by mx on 19/3/2017.
 */
public class Question_18 {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2016, Month.NOVEMBER, 6, 12, 0);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("US/Pacific")).plus(Period.ofDays(1));
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(localDateTime, ZoneId.of("US/Pacific")).plus(Duration.ofDays(1));
        System.out.println(zonedDateTime.getHour() + " " + zonedDateTime2.getHour());
    }
}
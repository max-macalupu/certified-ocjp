package org.oca.chapter08.zonetime;

import java.time.*;

/**
 * Created by max.macalupu on 2/28/2017.
 */
class ZonedDateTimes{
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        ZoneId zonedDateTime = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(localDate, localTime, zonedDateTime);
        System.out.println(zonedDateTime1);
    }
}
package org.oca.chapter08.zonetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 * Created by max.macalupu on 2/28/2017.
 */
public class ZoneOffData {

    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("America/Bogota");
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);
        ZoneOffset zoneOffset = zonedDateTime.getOffset();
        System.out.println(zoneOffset);
    }
}
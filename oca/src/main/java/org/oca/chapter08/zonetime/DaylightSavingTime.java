package org.oca.chapter08.zonetime;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;

/**
 * Created by max.macalupu on 2/28/2017.
 */
public class DaylightSavingTime {

    public static void main(String[] args) {
        ZoneId holkataaZone = ZoneId.of("Asia/Kolkata");
        Duration kolkataDST = holkataaZone.getRules().getDaylightSavings(Instant.now());
        System.out.printf("Kolkata zone DST is: %d hours %n", kolkataDST.toHours());


        ZoneId americaLimaZone = ZoneId.of("America/Bogota");
        Duration limaDST = americaLimaZone.getRules().getDaylightSavings(Instant.now());
        System.out.printf("Lima zone DST is: %d hours %n", limaDST.toHours());
    }
}

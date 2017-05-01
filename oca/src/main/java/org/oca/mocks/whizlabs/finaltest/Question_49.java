package org.oca.mocks.whizlabs.finaltest;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Created by mx on 30/4/2017.
 */
public class Question_49 {
    public static void main(String[] args) {
        processThisFunction();
    }

    private static void processThisFunction(){
        Instant instant = Instant.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, ZoneId.of("Canada/Atlantic"));
        System.out.println(zonedDateTime.getHour());
    }
}

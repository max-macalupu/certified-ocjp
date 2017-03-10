package org.oca.chapter08.instant;

import java.time.Instant;
import java.time.LocalDateTime;

/**
 * Created by max.macalupu on 2/27/2017.
 */
public class UsingInstant {

    public static void see_differences_between_timedate_and_instant(){
        LocalDateTime localDateTime = LocalDateTime.now();
        Instant instant = Instant.now();
        System.out.println("Local Date Time is: " +localDateTime + ", Instant: " + instant);
    }

    public static void main(String[] args) {
        Instant currTimeStamp = Instant.now();
        System.out.println("Instant timestamp is: " +currTimeStamp);

        System.out.println("Number of seconds elapsed: "+currTimeStamp.getEpochSecond());

        System.out.println("Number of miliseconds elapsed: "+currTimeStamp.toEpochMilli());

        see_differences_between_timedate_and_instant();
    }
}

package org.oca.chapter08.formating;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by max.macalupu on 2/28/2017.
 */
public class FormatForTime {
    public static void main(String[] args) {
        LocalTime wakeupTime = LocalTime.of(6, 0);
        System.out.printf("Wake up time: " + DateTimeFormatter.ISO_TIME.format(wakeupTime));
//        System.out.printf("Wake up time: " + DateTimeFormatter.RFC_1123_DATE_TIME.format(wakeupTime));
        System.out.printf("Wake up time: " + DateTimeFormatter.ISO_LOCAL_TIME.format(wakeupTime));
    }
}
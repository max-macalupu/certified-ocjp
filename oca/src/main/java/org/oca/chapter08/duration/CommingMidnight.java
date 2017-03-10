package org.oca.chapter08.duration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by max.macalupu on 2/28/2017.
 */
public class CommingMidnight {

    public static void main(String[] args) {
        LocalDateTime comingMidNight = LocalDateTime.of(LocalDate.now().plusDays(1), LocalTime.MIDNIGHT);
        LocalDateTime localDateTime = LocalDateTime.now();
        Duration duration = Duration.between(localDateTime, comingMidNight);
        System.out.println(duration);
    }
}

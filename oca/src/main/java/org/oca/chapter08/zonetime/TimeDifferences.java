package org.oca.chapter08.zonetime;

import java.time.*;

/**
 * Created by max.macalupu on 2/28/2017.
 */
public class TimeDifferences {

    public static void main(String[] args) {
        ZoneId singaporeZone = ZoneId.of("Asia/Singapore");
        ZonedDateTime dateTimeInDifference = ZonedDateTime.of(LocalDateTime.of(2016, Month.JANUARY, 1, 6, 0), singaporeZone);
        ZoneId zoneIdOfPeru = ZoneId.of("America/Bogota");
        ZonedDateTime sameDateTimeInLIma = dateTimeInDifference.withZoneSameInstant(zoneIdOfPeru);

        Duration timeDifferences = Duration.between(dateTimeInDifference.toLocalTime(), sameDateTimeInLIma.toLocalTime());

        System.out.printf("Time differences between %s and %s zones is: %d hours", singaporeZone, zoneIdOfPeru, timeDifferences.toHours());
    }
}

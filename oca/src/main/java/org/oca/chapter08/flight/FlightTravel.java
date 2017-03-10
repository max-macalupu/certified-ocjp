package org.oca.chapter08.flight;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by max.macalupu on 2/28/2017.
 */
public class FlightTravel {

    private static final String ORIGIN_CITY = "America/Bogota";
    private static final String TARGET_CITY = "Asia/Singapore";

    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy hh.mm a");

        ZonedDateTime departure = ZonedDateTime.of(LocalDateTime.of(2016, Month.JANUARY, 1, 6, 0), ZoneId.of(ORIGIN_CITY));

        System.out.println("Departure: " + dateTimeFormatter.format(departure));

        ZonedDateTime arrival = departure.withZoneSameInstant(ZoneId.of(TARGET_CITY)).plusHours(10);

        System.out.println("Arrival: " + dateTimeFormatter.format(arrival));
    }
}

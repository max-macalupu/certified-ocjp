package org.oca.chapter08.formating;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by max.macalupu on 2/28/2017.
 */
public class CustomTimePatterns {

    public static void main(String[] args) {

        String[] patterns = {
                "h:mm",
                "hh 'o' 'clock'",
                "H:mm a",
                "hh:mm:ss:SS",
                "K:mm:ss a"
        };

        LocalDateTime now = LocalDateTime.now();
        for(String dateTimeFormat: patterns){
            System.out.printf("Patter: \"%s\" is %s %n", dateTimeFormat, DateTimeFormatter.ofPattern(dateTimeFormat).format(now));
        }

    }
}
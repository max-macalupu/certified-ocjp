package org.oca.chapter08.formating;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by max.macalupu on 2/28/2017.
 */
public class CustomDatePatterns {

    public static void main(String[] args) {

        String[] patterns = {
                "dd-MM-yyyy",
                "d '('E')' MMM, YYYY",
                "w' th week of' YYYY",
                "EEEE, dd'th' MMMM, YYYY"
        };

        LocalDateTime now = LocalDateTime.now();
        for(String dateTimeFormat: patterns){
            System.out.printf("Patter: \"%s\" is %s %n", dateTimeFormat, DateTimeFormatter.ofPattern(dateTimeFormat).format(now));
        }

    }
}
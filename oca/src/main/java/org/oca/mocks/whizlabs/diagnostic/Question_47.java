package org.oca.mocks.whizlabs.diagnostic;

import java.time.*;

/**
 * Created by mx on 18/3/2017.
 */
public class Question_47 {

    public static void main(String[] args) {
        Period period = Period.between(LocalDate.of(2016, 2, 3), LocalDate.of(2016, Month.JANUARY, 1));
        Duration duration = Duration.between(LocalTime.of(1, 2, 3), LocalDateTime.of(2016, Month.JANUARY, 1, 1, 1));
        System.out.println(period +" " + duration);
    }
}
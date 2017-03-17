package org.oca.mocks.whizlabs.diagnostic;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * Created by mx on 16/3/2017.
 */
public class Question_01 {

    public static void main(String[] args) {

//        LocalTime localTime = LocalTime.now();
        LocalTime localTime = LocalTime.of(10,10,10);
        LocalTime earlyTime = LocalTime.of(8,0).withMinute(localTime.getMinute());
        LocalTime laterTime = LocalTime.of(12, 30).withMinute(localTime.getMinute());

        Long timePassed = localTime.until(earlyTime, ChronoUnit.HOURS);
        Long timeToPass = localTime.until(laterTime, ChronoUnit.HOURS);

        Long timePassed_min = localTime.until(earlyTime, ChronoUnit.MINUTES);
        Long timeToPass_min = localTime.until(laterTime, ChronoUnit.MINUTES);

        System.out.println(timePassed + " " + timeToPass);
        System.out.println(timePassed_min + " " + timeToPass_min);

    }

}

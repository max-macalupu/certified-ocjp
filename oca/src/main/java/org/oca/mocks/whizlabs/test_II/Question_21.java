package org.oca.mocks.whizlabs.test_II;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

/**
 * Created by mx on 8/4/2017.
 */
public class Question_21 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2017, Month.APRIL, 10, 10, 6);
        LocalDateTime secondLocalDateTime = LocalDateTime.of(2017, Month.APRIL, 10, 10, 2);
        Duration duration = Duration.between(localDateTime, secondLocalDateTime);
        System.out.println(duration);
    }
}

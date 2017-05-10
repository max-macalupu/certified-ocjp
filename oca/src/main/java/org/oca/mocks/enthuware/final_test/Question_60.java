package org.oca.mocks.enthuware.final_test;

import java.time.Instant;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_60 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        Instant notNow = now.truncatedTo(ChronoUnit.DAYS);
        System.out.println(notNow);
    }
}

package org.oca.mocks.whizlabs.practice_test_one;

import java.time.Duration;
import java.time.Period;

/**
 * Created by mx on 25/4/2017.
 */
public class Question_60 {
    public static void main(String[] args) {
        processThisAwesomeFunctionOfCode();
    }

    private static void processThisAwesomeFunctionOfCode(){
        Period period = Period.ofDays(30)    ;
        Duration duration = Duration.ofDays(30);
        System.out.println(period + " " + duration);
    }
}

package org.oca.mocks.whizlabs.test_II;

import java.time.Duration;

/**
 * Created by mx on 24/4/2017.
 */
public class Question_58 {
    public static void main(String[] args) {
        processAsFunction();
    }

    private static void processAsFunction(){
        Duration duration = Duration.ofSeconds(90061);
        Duration duration1 = Duration.ofMillis(1001);
        System.out.println(duration);
        System.out.println(duration1);
    }
}
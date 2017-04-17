package org.oca.mocks.whizlabs.test_III;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

/**
 * Created by mx on 14/4/2017.
 */
public class Question_60 {
    public static void main(String[] args) {
        processThisAwesomeMethod();
    }

    private static void processThisAwesomeMethod(){
        Instant instant = Instant.now().truncatedTo(ChronoUnit.SECONDS);
        System.out.println(instant);
        System.out.println(Instant.now());
    }
}

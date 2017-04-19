package org.oca.mocks.whizlabs.test_IV;

import java.time.Period;

/**
 * Created by AVANTICA TECHNOLOGIES on 4/18/2017.
 */
public class Question_56 {
    public static void main(String[] args) {
        processThisAwesomeMethod();
    }

    private static void processThisAwesomeMethod(){
        Period period = Period.ofMonths(203);
        System.out.println(period);
        System.out.println(period.normalized());
    }
}

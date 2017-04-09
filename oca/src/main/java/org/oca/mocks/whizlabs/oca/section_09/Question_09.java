package org.oca.mocks.whizlabs.oca.section_09;

import java.time.Period;

/**
 * Created by mx on 8/4/2017.
 */
public class Question_09 {
    public static void main(String[] args) {
        Period period = Period.ofMonths(13);
        System.out.println(period.normalized());
        System.out.println(period);

        Period periodDays = Period.ofDays(1000);
        System.out.println(periodDays.normalized());
    }
}

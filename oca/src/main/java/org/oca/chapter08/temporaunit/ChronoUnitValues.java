package org.oca.chapter08.temporaunit;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * Created by max.macalupu on 2/28/2017.
 */
public class ChronoUnitValues {

    private static void show_some_chrono_units_application(){
        System.out.println(Duration.of(1, ChronoUnit.DAYS).getSeconds());
        System.out.println(Duration.of(1, ChronoUnit.HALF_DAYS).getSeconds());
        System.out.println(Duration.of(12, ChronoUnit.HOURS).getSeconds());
    }

    public static void main(String[] args) {
        System.out.println("Chrono DateBased TimeBased Duration");
        System.out.println("****************************************");
        for(ChronoUnit chronoUnit: ChronoUnit.values()){
//            System.out.println(chronoUnit);
            System.out.printf("%10s \t %b \t\t %b \t\t %s %n", chronoUnit, chronoUnit.isDateBased(), chronoUnit.isTimeBased(), chronoUnit.getDuration());
        }

        show_some_chrono_units_application();
    }
}

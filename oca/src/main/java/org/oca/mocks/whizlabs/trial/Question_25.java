package org.oca.mocks.whizlabs.trial;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Created by mx on 11/3/2017.
 */
public class Question_25 {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2016, Month.JANUARY, 1);
        LocalDate localDate_2 = LocalDate.of(2017, Month.JANUARY, 1);

        Duration duration = Duration.between(localDate, localDate_2);
        Period period = Period.between(localDate, localDate_2);
        System.out.println(period);

        List<Map<String,Integer>> map = new ArrayList<Map<String, Integer>>();
    }

}

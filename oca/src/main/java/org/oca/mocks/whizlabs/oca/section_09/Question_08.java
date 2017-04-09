package org.oca.mocks.whizlabs.oca.section_09;

import java.time.LocalDate;

/**
 * Created by mx on 8/4/2017.
 */
public class Question_08 {
    public static void main(String[] args) {
        LocalDate localDate =LocalDate.of(2015, 2, 27);
        System.out.println(localDate.getMonth().getValue() + " " + localDate.getYear() + " " + localDate.getDayOfMonth());
    }
}

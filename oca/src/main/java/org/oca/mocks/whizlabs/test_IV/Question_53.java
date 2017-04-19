package org.oca.mocks.whizlabs.test_IV;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Created by AVANTICA TECHNOLOGIES on 4/18/2017.
 */
public class Question_53 {
    public static void main(String[] args) {
        processThisAwkfullFunction();
    }

    private static void processThisAwkfullFunction(){
        LocalDate localDate = LocalDate.of(2015, 2, 27);
        LocalDate localDate2 = LocalDate.of(2015, 2, 28);
        long size = localDate.until(localDate2, ChronoUnit.HALF_DAYS);
        System.out.println(size);
    }
}
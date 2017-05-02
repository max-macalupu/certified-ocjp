package org.oca.mocks.enthuware.test_I;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by mx on 1/5/2017.
 */
public class Question_17 {
    public static void main(String[] args) {
        processThisInterestingFunctionInTheCode();
    }

    private static void processThisInterestingFunctionInTheCode(){
//        LocalDate localDate = LocalDate.parse("2015-02-05", DateTimeFormatter.ISO_DATE);
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2015, 02, 05);
//        System.out.println(localDate);
        System.out.println(localDate1);
        System.out.println(localDate2);
    }
}

package org.oca.mocks.whizlabs.test_IV;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by AVANTICA TECHNOLOGIES on 4/18/2017.
 */
public class Question_59 {
    public static void main(String[] args) {
        processThisAWesomeMethod();
    }

    private static void processThisAWesomeMethod(){
        LocalDate localDate = LocalDate.of(2000, 3, 1);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d MMM uuuu");
        System.out.println(dateTimeFormatter.format(localDate));
    }
}
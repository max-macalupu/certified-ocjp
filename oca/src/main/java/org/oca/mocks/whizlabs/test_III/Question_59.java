package org.oca.mocks.whizlabs.test_III;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by mx on 14/4/2017.
 */
public class Question_59 {
    public static void main(String[] args) {
        processThisAwesomeMethod();
    }

    private static void processThisAwesomeMethod(){
        LocalDateTime localDateTime = LocalDateTime.parse("2018-06-30T23:59:59");
        String output  = localDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(output);
    }
}
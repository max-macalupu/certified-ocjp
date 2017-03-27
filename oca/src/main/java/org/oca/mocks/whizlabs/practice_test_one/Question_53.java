package org.oca.mocks.whizlabs.practice_test_one;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by mx on 26/3/2017.
 */
public class Question_53 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.parse("2017-01-01");
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_DATE_TIME));
    }
}
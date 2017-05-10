package org.oca.mocks.enthuware.missing_test_III;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_23 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.parse("2015-01-01");
        String str = localDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(str);
    }
}

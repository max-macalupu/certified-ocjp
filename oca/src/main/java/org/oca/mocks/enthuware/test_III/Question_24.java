package org.oca.mocks.enthuware.test_III;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by mx on 6/5/2017.
 */
public class Question_24 {
    public static void main(String[] args) {
        process(LocalDateTime.now());
    }

    private static String process(LocalDateTime localDateTime){
        return DateTimeFormatter.ISO_ZONED_DATE_TIME.format(localDateTime);
    }
}

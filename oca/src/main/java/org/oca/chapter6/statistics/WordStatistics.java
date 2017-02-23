package org.oca.chapter6.statistics;

import java.util.IntSummaryStatistics;
import java.util.regex.Pattern;

/**
 * Created by max.macalupu on 2/22/2017.
 */
public class WordStatistics {

    public static void process_first_operation(String operation_message){
        IntSummaryStatistics intSummaryStatistics = Pattern.compile(" ").
                            splitAsStream(operation_message).
                            mapToInt(word -> word.length()).summaryStatistics();
        System.out.printf("The number of words in the text is: %d %n The total number of lengths is %d %n The short word is %d %n The max word in length is %d",
                            intSummaryStatistics.getCount(), intSummaryStatistics.getSum(), intSummaryStatistics.getMin(), intSummaryStatistics.getMax());
    }

    public static void main(String [] args){
        String message = "There was a young lady named Bright " +
                "who traveled much faster than light " +
                "She set out one day " +
                "in a relative way " +
                "and came back the previous night ";
        process_first_operation(message);
    }
}
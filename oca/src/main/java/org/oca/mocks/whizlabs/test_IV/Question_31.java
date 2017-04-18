package org.oca.mocks.whizlabs.test_IV;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 * Created by mx on 18/4/2017.
 */
public class Question_31 {
    public static void main(String[] args) {
        processTHiSMethod();
    }

    private static void processTHiSMethod(){
        IntStream intStream = IntStream.of(1, 5, 10);
        IntSummaryStatistics intSummaryStatistics = intStream.summaryStatistics();
        intSummaryStatistics.accept(11);
        System.out.println(intSummaryStatistics.getAverage());
    }
}

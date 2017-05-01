package org.oca.mocks.whizlabs.finaltest;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 * Created by mx on 29/4/2017.
 */
public class Question_30 {

    public static void main(String[] args) {
        processTHisInteresting();
    }

    private static void processTHisInteresting(){
        IntStream intStream = IntStream.of(1, 12, 4, 9, 10);
        IntSummaryStatistics intSummaryStatistics = intStream.summaryStatistics();
//        intSummaryStatistics.accept(intSummaryStatistics.getCount());
        System.out.println(intSummaryStatistics.getSum());
    }
}

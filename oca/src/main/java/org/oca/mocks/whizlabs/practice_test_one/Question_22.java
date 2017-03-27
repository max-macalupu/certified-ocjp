package org.oca.mocks.whizlabs.practice_test_one;

import java.util.stream.IntStream;

/**
 * Created by mx on 25/3/2017.
 */
public class Question_22 {
    public static void main(String[] args) {
        System.out.println(IntStream.range(1,6).peek(System.out::println).reduce((a,b) -> a+b).orElse(0));
        System.out.println(IntStream.range(1,6).peek(System.out::println).average().orElse(0));

        IntStream intStream = IntStream.range(1, 6);
        long count = intStream.count();
        System.out.println(intStream.average().orElse(0) * count);
    }
}
package org.oca.mocks.whizlabs.practice_test_one;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by mx on 25/3/2017.
 */
public class Question_33 {
    public static void main(String[] args) {
        List<Integer> listStream = Arrays.asList(-8, -6, -5, -1, 0, 1, 5, 6, 8);
        Predicate<Integer> negative = x -> {
            System.out.println("N:"+x);
            return x < 0;
        };
        Predicate<Integer> positive = x -> {
            System.out.println("P:"+x);
            return x > 0;
        };
        listStream.stream().peek(x -> System.out.println("soup_01"+x)).filter(positive).peek(x -> System.out.println("soup_02"+x)).allMatch(negative);
    }
}
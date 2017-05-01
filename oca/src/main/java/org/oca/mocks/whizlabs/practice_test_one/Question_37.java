package org.oca.mocks.whizlabs.practice_test_one;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by mx on 26/3/2017.
 */
public class Question_37 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 6, 3, 10, 5);
        int max = integerList.stream().reduce((a,b) -> a>b?a:b).get();
        int max2 = integerList.stream().reduce(Integer.MIN_VALUE, (a,b) -> a>b?a:b);
        int max3 = integerList.stream().max(Comparator.comparing((y) -> y)).get();
        int max4 = integerList.stream().max(Comparator.comparingInt((y) -> y)).get();
        System.out.println(max + " " + max2+ " " + max3 + " " +max4);
    }
}

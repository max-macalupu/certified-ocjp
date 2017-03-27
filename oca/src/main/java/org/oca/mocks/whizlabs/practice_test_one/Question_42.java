package org.oca.mocks.whizlabs.practice_test_one;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by mx on 26/3/2017.
 */
public class Question_42 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 7, 10, 9);
        System.out.println(list.stream().max(Integer::max).get());
        System.out.println(list.stream().max((a,b) -> a>b?a:b).get());
        System.out.println(list.stream().max(Comparator.comparing(a-> a)).get());
    }
}
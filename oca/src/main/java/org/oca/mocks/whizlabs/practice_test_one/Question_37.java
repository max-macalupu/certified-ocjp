package org.oca.mocks.whizlabs.practice_test_one;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mx on 26/3/2017.
 */
public class Question_37 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 6, 3, 10, 5);
        int max = integerList.stream().reduce((a,b) -> a>b?a:b).get();
        System.out.println(max);
    }
}

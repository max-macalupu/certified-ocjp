package org.oca.mocks.whizlabs.practice_test_one;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mx on 26/3/2017.
 */
public class Question_43 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("a","b","c");
        stringList.stream().forEach(x -> x = x.toUpperCase());
        stringList.stream().forEach(System.out::println);
    }
}
package org.oca.mocks.whizlabs.practice_test_one;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by mx on 26/3/2017.
 */
public class Question_29 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("one", "two", "three");
        List<String> stringList2 = Arrays.asList("one", "two", "three");
        List<Integer> integerList = Arrays.asList(1, 5, 6, 7);
        Stream.of(stringList, stringList2, integerList).flatMap(e -> Stream.of(e)).forEach(System.out::println);
        Stream.of(stringList, integerList).flatMap(e -> e.stream()).forEach(System.out::println);
    }
}

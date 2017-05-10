package org.oca.mocks.enthuware.test_IV;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by mx on 8/5/2017.
 */
public class Question_39 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(3, 10, 5, 1, 9, 7, 4,20, 11, 21);
        Stream<Integer> integerStream = integerList.stream();
        Predicate<Integer> integerPredicate = x -> x>10;
        integerStream.collect(Collectors.
                                partitioningBy(integerPredicate, Collectors.counting())).
                                values().
                                forEach(System.out::print);
    }
}

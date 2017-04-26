package org.oca.mocks.whizlabs.diagnostic;

import java.util.*;

/**
 * Created by max.macalupu on 3/17/2017.
 */
public class Question_30 {
    public static void main(String[] args) {

        Set<Integer> firstIntegerSet = new HashSet<>(Arrays.asList(3, 5, 9, 11, 29));
        Set<Integer> secondIntegerSet = new HashSet<>(Arrays.asList(23, 25, 29, 211, 229));
        List<Set<Integer>> listOfSets = Arrays.asList(firstIntegerSet, secondIntegerSet);

        Optional<?> optional = listOfSets.stream().flatMap( stream -> stream.stream()).reduce(Integer::sum);

        System.out.println(optional.get());
        System.out.println();
        System.out.println(listOfSets.stream().flatMap( stream -> stream.stream().map(x -> x*x)).distinct().peek(System.out::println).count());

    }
}

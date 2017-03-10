package org.oca.mocks.enthuware.trial;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by max.macalupu on 3/10/2017.
 */
public class Question_04 {

    public static void main(String[] args) {
        Stream<Integer> streamInteger = IntStream.rangeClosed(10,15).boxed();
        Stream<Integer> streamInteger2 = IntStream.rangeClosed(10,15).boxed();
        Object obj = streamInteger.collect(Collectors.partitioningBy(x-> x%2==0));
        Map objMap = streamInteger2.collect(Collectors.partitioningBy(x-> x%2==0));
        System.out.println(obj);
        System.out.println(objMap);
    }
}
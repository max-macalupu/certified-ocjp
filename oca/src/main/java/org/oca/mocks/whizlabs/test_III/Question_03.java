package org.oca.mocks.whizlabs.test_III;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by mx on 9/4/2017.
 */
public class Question_03 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 4);
        Object val = intStream.boxed().collect(Collectors.partitioningBy(i -> i%2==0)).get(true);
//        Object val = intStream.collect(Collectors.partitioningBy(i -> i%2==0)).get(true);
        System.out.println(val);
    }
}
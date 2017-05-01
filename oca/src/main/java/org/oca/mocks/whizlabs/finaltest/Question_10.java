package org.oca.mocks.whizlabs.finaltest;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by mx on 29/4/2017.
 */
public class Question_10 {
    public static void main(String[] args) {
        processThisInterestingMethod();
    }

    private static void processThisInterestingMethod(){
        Stream<String> stringStream = Stream.of("Java", "OCJP", "OJCEA");
//        Stream<Integer> intStream = stringStream.map( x -> x.length());
        IntStream intStreamInt = stringStream.mapToInt( x -> x.length());
//        System.out.println(intStream.collect(Collectors.toList()));
        System.out.println(intStreamInt.boxed().collect(Collectors.toList()));
    }
}

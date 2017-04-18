package org.oca.mocks.whizlabs.test_IV;

import java.util.function.LongFunction;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Created by mx on 18/4/2017.
 */
public class Question_37 {
    public static void main(String[] args) {
        processThisMethod();
    }

    private static void processThisMethod(){
        LongStream longStream = LongStream.of(1 , 6, 10, 4);
        LongFunction<Integer> lf = l -> (int)l;
        Stream<Integer> integerStream = longStream.mapToObj(lf);
        System.out.println(integerStream.collect(Collectors.toList()));
    }
}

package org.oca.mocks.whizlabs.test_IV;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by AVANTICA TECHNOLOGIES on 4/18/2017.
 */
public class Question_42 {
    public static void main(String[] args) {
        processThisAwesomeMethodAsFunction();
    }

    private static void processThisAwesomeMethodAsFunction(){
        IntStream intStream = IntStream.of(1, 5, 10);
        Stream<String> stringStream = intStream.boxed().map(x -> ""+x.toString());
//        Stream<String> stringStream = intStream.boxed().map(String::valueOf);
        System.out.println(stringStream.findAny());

    }
}

package org.oca.mocks.whizlabs.finaltest;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

/**
 * Created by mx on 29/4/2017.
 */
public class Question_44 {

    public static void main(String[] args) {
        process();
    }

    private static void process(){
        IntStream intStream = IntStream.of(2, 4, 10, 3);
        IntConsumer intConsumer = System.out::print;
        intConsumer.accept(intStream.sum());
    }
}

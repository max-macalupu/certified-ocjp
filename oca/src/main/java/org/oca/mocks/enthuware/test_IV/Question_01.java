package org.oca.mocks.enthuware.test_IV;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/**
 * Created by mx on 8/5/2017.
 */
public class Question_01 {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
//        Stream<String> stream = Stream.of("Old","King","Porque","mama","Lo","Siento","Este","Es").parallel();
        Stream<String> stream = Stream.of("Old","King","Porque","mama","Lo","Siento","Este","Es");
        boolean bool = stream.filter(x -> {
            atomicInteger.incrementAndGet();
            System.out.println(x);
            return x.contains("o");
        }).allMatch(x -> x.indexOf("o")>0);
//        }).anyMatch(x -> x.indexOf("o")>0);
        System.out.println(bool + " " + atomicInteger);
    }
}

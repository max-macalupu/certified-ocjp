package org.oca.mocks.whizlabs.finaltest;

import java.util.stream.Stream;

/**
 * Created by mx on 29/4/2017.
 */
public class Question_16 {
    public static void main(String[] args) {
        processThis();
    }

    private static void processThis(){
        Stream<String> stringStream = Stream.of("AB", "ABC");
        System.out.println(stringStream.max((x,y) -> Integer.compare(x.length(),y.length())).get());
//        System.out.println(stringStream.max(1).get());
    }
}
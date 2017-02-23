package org.oca.chapter6.stream;

import java.util.stream.Stream;

/**
 * Created by max.macalupu on 2/21/2017.
 */
public class StreamCount {

    public static void main(String [] args){
        Long countStream = Stream.of(2,4,5,6).filter(z -> {System.out.println(z);return true;}).map(x -> x*x + 1).count();
        Long countStream_2 = Stream.of(2,4,5,6).map(x -> x*x + 1).peek(System.out::println).count();
        Long countStream_3 = Stream.of(2,4,5,6).peek(x -> System.out.printf("%d, ",x)).map(x -> x*x + 1).peek(x -> System.out.printf("%d, ",x)).count();
        System.out.printf("%n The number of map is: %d",countStream);
        System.out.printf("%n The number of map is: %d",countStream_2);
        System.out.printf("%n The number of map is: %d",countStream_3);
    }
}
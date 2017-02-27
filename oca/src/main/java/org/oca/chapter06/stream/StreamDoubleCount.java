package org.oca.chapter06.stream;

import java.util.stream.DoubleStream;

/**
 * Created by max.macalupu on 2/21/2017.
 */
public class StreamDoubleCount {

    public static void main(String [] args){
        double sum = DoubleStream.of(4.0, 9.0, 16.0, 36.0).map(Math::sqrt).peek(System.out::println).sum();
        System.out.printf("Result of sum double: " + sum);
//        System.out.printf("The number of map is: %d","hi");
//        System.out.printf("%n The number of map is: %d", new String(""+sum.toString()));
    }
}
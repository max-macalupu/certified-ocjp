package org.oca.chapter6.statistics;

import java.util.stream.IntStream;

/**
 * Created by max.macalupu on 2/22/2017.
 */
public class Factorial {

    public static void main(String [] args){
        int resultAsInt = IntStream.range(1,5).reduce((x,y) -> x*y).getAsInt();
        System.out.printf("The final result as int is: %d", resultAsInt);
    }
}
package org.oca.chapter6.match;

import java.util.stream.Stream;

/**
 * Created by max.macalupu on 2/21/2017.
 */
public class MatchUse {

    public static void main(String [] args){
        boolean anyMatch = Stream.of(4, 6,1, 8, 1).anyMatch(x -> x%2==0);
        System.out.println("Printing anyMatch validation: "+anyMatch);
        boolean allMatch = Stream.of(4, 6,1, 8, 1).allMatch(x -> x<10);
        System.out.println("Printing anyMatch validation: "+allMatch);
        boolean noneMatch = Stream.of(4, 6,1, 8, 1).noneMatch(x -> x<0);
        System.out.println("Printing anyMatch validation: "+noneMatch);
    }
}
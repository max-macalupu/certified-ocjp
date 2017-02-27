package org.oca.chapter06.test;

import java.util.stream.Stream;

/**
 * Created by max.macalupu on 2/24/2017.
 */
public class Question_01 {

    public static void main(String [] args){
//        "abracadabra".chars().distinct().peek( ch -> System.out.printf("The value is: %c", ch)).sorted();
        String valueForStream = "abracadabra";
        Stream.of(valueForStream.split("")).distinct().sorted().forEach(System.out::println);
//        1,2,3,6 WITH ERROR...
    }

}

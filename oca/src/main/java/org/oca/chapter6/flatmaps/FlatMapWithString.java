package org.oca.chapter6.flatmaps;

import java.util.Arrays;

/**
 * Created by max.macalupu on 2/24/2017.
 */
public class FlatMapWithString {


    public static void process_array_as_stream_without_flatmaps(String [] array_with_data){
        Arrays.stream(array_with_data).map( word -> word.split("")).distinct().forEach(System.out::println);
    }

    public static void process_array_as_stream_with_flatmaps(String [] array_with_data){
        Arrays.stream(array_with_data).flatMap( word -> Arrays.stream(word.split(""))).distinct().forEach(System.out::print);
    }

    public static void main(String [] args){
        process_array_as_stream_without_flatmaps("this is other awesome message from lambdas context".split(" "));
        process_array_as_stream_with_flatmaps("this is other awesome message from lambdas context".split(" "));
    }

}

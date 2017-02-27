package org.oca.chapter06.flatmaps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by max.macalupu on 2/24/2017.
 */
public class FlatMap {

    public static void main(String [] args){
        process_stream_with_flatmap(Arrays.asList(1,2,3,4,5));
        System.out.println();
        process_stream_with_advanced_flatmap(Arrays.asList(Arrays.asList(1,2), Arrays.asList(3,4,5)));
        System.out.println();
        process_stream_with_advanced_flatmap_with_list(Arrays.asList(Arrays.asList(1,2), Arrays.asList(3,4,5)));
    }

    private static void process_stream_with_advanced_flatmap(List<List<Integer>> lists) {
        lists.stream().flatMap(stream -> stream.stream()).sorted().map(i -> i*i).forEach(System.out::print);
    }

    private static void process_stream_with_advanced_flatmap_with_list(List<List<Integer>> lists) {
        List<Integer> listOfInteger = lists.stream().flatMap(stream -> stream.stream()).sorted().map(i -> i*i).collect(Collectors.toList());
        listOfInteger.forEach(System.out::println);
    }

    private static void process_stream_with_flatmap(List<Integer> integers) {
        integers.stream().map(i -> i * i).forEach(System.out::print);
    }
}
package org.oca.chapter06.tocollection;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by max.macalupu on 2/24/2017.
 */
public class CollectorsToTreeSet {

    public static void process_array_to_stream_for_treeset(String [] arrrayData){
        Set<String> set_from_stream = Stream.of(arrrayData).collect(Collectors.toCollection(TreeSet::new));
        set_from_stream.forEach(System.out::println);
    }

    public static void process_array_to_stream_array_for_treeset(String [] arrrayData){
        Set<String> set_from_stream = Arrays.stream(arrrayData).collect(Collectors.toCollection(TreeSet::new));
        set_from_stream.forEach(System.out::println);
    }

    public static void main(String [] args){
        //Are no differences between each other
        process_array_to_stream_for_treeset("this is my message for this awesome test i gonna take the next month i love this profession".split(" "));
        process_array_to_stream_array_for_treeset("this is my message for this awesome test i gonna take the next month i love this profession".split(" "));
    }
}
package org.oca.chapter6.tocollection;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by max.macalupu on 2/24/2017.
 */
public class CollectorsToMap {

    public static void process_array_for_map_from_stream(String[] array_with_data){
        Map<String, Integer> finalMap = Stream.of(array_with_data).collect(Collectors.toMap(name -> name, name -> name.length()));
        finalMap.forEach((x,y) -> System.out.printf("%n Key: %s ----- Value: %d", x, y));
    }

    public static void process_array_for_map_with_identity_from_stream(String[] array_with_data){
        Map<String, Integer> finalMap = Stream.of(array_with_data).collect(Collectors.toMap(Function.identity(), name -> name.length()));
        finalMap.forEach((x,y) -> System.out.printf("%n Key_*: %s ----- Value_*: %d", x, y));
    }

    public static void main(String [] args){
        process_array_for_map_from_stream("this is my text that will be processed array and then as map".split(" "));
        process_array_for_map_with_identity_from_stream("this is my text that will be processed array and then as map".split(" "));
    }
}
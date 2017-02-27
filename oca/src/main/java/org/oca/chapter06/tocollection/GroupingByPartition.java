package org.oca.chapter06.tocollection;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by max.macalupu on 2/24/2017.
 */
public class GroupingByPartition {

    public static void process_string_from_stream_for_partition(String [] array_with_data){
        Map<Boolean, List<String>> final_group_map = Stream.of(array_with_data).distinct().collect(Collectors.partitioningBy(x -> x.length() > 4));
        final_group_map.forEach( (x,y) -> System.out.println("Data greatest than for " + x  + ", Value:"+ y));
    }

    public static void main(String [] args){
        process_string_from_stream_for_partition("Hey this is my first awesome project with partition take it easy".split(" "));
    }
}
package org.oca.chapter06.tocollection;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by max.macalupu on 2/24/2017.
 */
public class GroupStringsByLength {

    public static void process_grouping_string_array_into_map_with_streams(String [] array_with_data){
        Map<Integer, List<String>> final_group_map = Stream.of(array_with_data).distinct().collect(Collectors.groupingBy(String::length));
        final_group_map.forEach((x,y) -> {
            System.out.printf("%nkey: %s ---> Values:{", x);
            y.forEach( z -> System.out.printf("%s, ", z));
            System.out.printf("}");
        });
    }

    public static void main(String [] args){
        process_grouping_string_array_into_map_with_streams("this is my second message because the las phrase was for other proposal now is different".split(" "));
    }
}
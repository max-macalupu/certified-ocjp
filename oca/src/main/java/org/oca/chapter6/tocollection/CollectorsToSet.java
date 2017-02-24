package org.oca.chapter6.tocollection;

import java.util.Arrays;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by max.macalupu on 2/24/2017.
 */
public class CollectorsToSet {

    private static void process_string_to_stream_for_collect(String process_message){
        Set<String> arrays_with_stream = Pattern.compile(":").splitAsStream(process_message).collect(Collectors.toSet());
        arrays_with_stream.forEach(System.out::println);
    }

    private static void process_array_to_stream_for_collect(String[] process_message){
        Set<String> arrays_with_stream = Arrays.stream(process_message).collect(Collectors.toSet());
        arrays_with_stream.forEach(System.out::println);
    }

    public static void main(String [] args){
        process_string_to_stream_for_collect("un:deux:trois:quatre:un:mx:trois:lo");
        process_array_to_stream_for_collect("un:deux:trois:quatre:un:mx:trois:lo".split(":"));
    }
}
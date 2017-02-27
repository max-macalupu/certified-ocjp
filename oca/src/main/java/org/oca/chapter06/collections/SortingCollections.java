package org.oca.chapter06.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by max.macalupu on 2/22/2017.
 */
public class SortingCollections {

    public static void process_string_as_stream_normal_sort(String message){
        List<String> words = Arrays.asList(message.split(" "));
        words.stream().distinct().sorted().forEach(System.out::println);
    }

    public static void process_string_as_stream_sort_by_length(String message){
        List<String> words = Arrays.asList(message.split(" "));
        Comparator<String> stringComparator = (x1, x2) -> x1.length() - x2.length();
        words.stream().distinct().sorted(stringComparator).forEach(System.out::println);
    }


    public static void process_string_as_stream_sort_by_length_then_sort_words(String message){
        List<String> words = Arrays.asList(message.split(" "));
        Comparator<String> stringComparator = (x1, x2) -> x1.length() - x2.length();
        words.stream().distinct().sorted(stringComparator.thenComparing(String::compareTo)).forEach(System.out::println);
    }

    public static void process_string_as_stream_sort_by_length_then_sort_words_reversed(String message){
        List<String> words = Arrays.asList(message.split(" "));
        Comparator<String> stringComparator = (x1, x2) -> x1.length() - x2.length();
        words.stream().distinct().sorted(stringComparator.thenComparing(String::compareTo).reversed()).forEach(System.out::println);
    }



    public static void main(String [] args){
        process_string_as_stream_normal_sort("follow your heart but you take your brain with you");
        System.out.println();
        process_string_as_stream_sort_by_length("follow your heart but you take your brain with you");
        System.out.println();
        process_string_as_stream_sort_by_length_then_sort_words("follow your heart but you take your brain with you");
        System.out.println();
        process_string_as_stream_sort_by_length_then_sort_words_reversed("follow your heart but you take your brain with you");
    }
}
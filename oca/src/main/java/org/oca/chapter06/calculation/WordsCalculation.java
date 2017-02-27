package org.oca.chapter06.calculation;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by max.macalupu on 2/22/2017.
 */
public class WordsCalculation {


    public static void process_first_simple_string(String messateString){
        String[] message_in_array = messateString.split(" ");
        System.out.println(Arrays.stream(message_in_array).min(String::compareTo).get());
    }

    public static void process_second_simple_string(String messateString){
        Comparator<String> comparator = (x1, x2) -> x1.length() - x2.length();
        String[] message_in_array = messateString.split(" ");
        System.out.println(Arrays.stream(message_in_array).min(comparator).get());
    }

    public static void main(String [] args){
        process_first_simple_string("this is my first phrase in the oca because i never made something before in the clean way");
        process_second_simple_string("this is my first phrase in the oca because i never made something before in the clean way");
    }
}

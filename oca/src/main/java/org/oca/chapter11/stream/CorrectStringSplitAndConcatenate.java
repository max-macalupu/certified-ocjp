package org.oca.chapter11.stream;

import java.util.Arrays;
import java.util.Optional;

/**
 * Created by mx on 19/2/2017.
 */
public class CorrectStringSplitAndConcatenate {

    public static void main(String [] args){
        String words [] = "This is a message from my own stream because I know how it works".split(" ");
        Optional<String> originalString = Arrays.stream(words).parallel().reduce((a,b) -> a + " " + b);
        System.out.println(originalString.get());
    }
}
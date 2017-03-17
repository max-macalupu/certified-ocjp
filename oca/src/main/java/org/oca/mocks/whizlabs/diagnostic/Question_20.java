package org.oca.mocks.whizlabs.diagnostic;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by max.macalupu on 3/17/2017.
 */
public class Question_20 {

    public static void main(String[] args) {
        Stream<String> stringStream = Arrays.stream(new String[]{"a","b","c"});
        String finalString = stringStream.filter( s -> {
                                if(s.compareTo("abc")>10) return true;
                                return false;
                                }).peek(System.out::println).collect(Collectors.joining());
        System.out.println(finalString);
    }
}

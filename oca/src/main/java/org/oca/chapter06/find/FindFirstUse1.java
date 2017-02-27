package org.oca.chapter06.find;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by max.macalupu on 2/21/2017.
 */
public class FindFirstUse1 {
    public static void main(String [] args){
        Method[] streamMethods = Stream.class.getMethods();
        Optional<String> stringMethod = Arrays.stream(streamMethods).map(method -> method.getName()).filter( x -> x.endsWith("Match")).sorted().findFirst();
        System.out.printf("Result of the find first is: "+ stringMethod.orElse("Nothing to Show"));
//        Arrays.stream(streamMethods).peek(x -> System.out.println(x.getName()));
//        Stream.of(streamMethods).peek(x -> System.out.println(x.getName()));
    }
}
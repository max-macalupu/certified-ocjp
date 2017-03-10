package org.oca.mocks.enthuware.trial;

import java.util.Arrays;
import java.util.List;

/**
 * Created by max.macalupu on 3/10/2017.
 */
public class Question_01 {

    private static void execute_simple_parallel_stream(){
        List<String> arrayList = Arrays.asList("a","b");
        String join = arrayList.parallelStream().reduce("_",(a,b) -> a.concat(b));
        System.out.println(join);
    }

    public static void main(String[] args) {
        execute_simple_parallel_stream();
        execute_advanced_parallel_stream();
    }

    private static void execute_advanced_parallel_stream() {
        List<String> arrayList = Arrays.asList(
                "a","b","c","d","e",
                "a","b","c","d","e",
                "a","b","c","d","e",
                "a","b","c","d","e",
                "a","b","c","d","e"
        );

        String join = arrayList.parallelStream().peek(System.out::println).
                                reduce("_", (a,b) -> {
                                                                String newConcat = a.concat(b);
                                    System.out.println("Value a is: " + a+ ", the value b is: "+b+", the result is: "+newConcat+", the thread is: "+Thread.currentThread().getName());
                                    return newConcat;
                                                    },(a,b) -> {
                                                                String newConcat = a.concat(b);
                                    System.out.println("Value a is: " + a+ ", the value b is: "+b+", the result is: "+newConcat+", the thread is: "+Thread.currentThread().getName());
                                    return newConcat;
                                                    });

        System.out.println("Final result is: " + join);
    }
}
package org.oca.mocks.whizlabs.test_III;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by AVANTICA TECHNOLOGIES on 4/11/2017.
 */
public class Question_31 {
    public static void main(String[] args) {
        process_this_function_that_will_work();
    }

    private static void process_this_function_that_will_work(){
        List<Integer> integerListOne = Arrays.asList(1, 2, 3, 4);
        List<Integer> integerListTwo = Arrays.asList(3, 4, 5, 6);
        List<Integer> integerListThree = Arrays.asList(5, 6, 7, 8);
        List<List<Integer>> listAll = Arrays.asList(integerListOne, integerListTwo, integerListThree);

        listAll.stream().flatMap(l -> l.stream()).distinct().peek(System.out::print).noneMatch(l -> l < 0);
        System.out.println();
        listAll.stream().flatMap(l -> l.stream()).distinct().peek(System.out::print).allMatch(l -> l > 0);
        System.out.println();
        listAll.stream().flatMap(l -> Stream.of(l)).distinct().forEach(l -> {System.out.println("-> " + l);});
    }
}

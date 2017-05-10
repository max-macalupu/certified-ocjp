package org.oca.mocks.enthuware.final_test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_34 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4, 10, 4, 9, 7, 32, 12);
        System.out.println(integerList.stream().mapToInt( x->x).sum());
        System.out.println(integerList.stream().reduce(10, (a,b) -> a+b));
        System.out.println(integerList.stream().collect(Collectors.mapping(x->x, Collectors.summarizingInt(x->x))).getSum());
        System.out.println(integerList.stream().collect(Collectors.summarizingInt(x->x)).getSum());
    }
}
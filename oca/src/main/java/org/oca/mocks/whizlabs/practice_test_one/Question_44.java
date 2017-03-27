package org.oca.mocks.whizlabs.practice_test_one;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created by mx on 26/3/2017.
 */
public class Question_44 {
    public static void main(String[] args) {
        List<String>stringList = Arrays.asList("a", "b", "c");
        System.out.println(calculate(stringList, stringsList -> stringsList.indexOf("b")));
        System.out.println(calculate(stringList, stringsList -> stringsList.size()));
    }
    static int calculate(List<String> list, Function<List<String>, Integer> function){
        return function.apply(list);
    }
}
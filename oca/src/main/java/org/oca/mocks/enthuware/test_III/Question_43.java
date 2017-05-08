package org.oca.mocks.enthuware.test_III;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by mx on 6/5/2017.
 */
public class Question_43 {
    public static void main(String[] args) {
        process();
    }

    private static void process(){
        List<String> ls = Arrays.asList("Tom cruise", "Tom Hart", "Tom Hanks", "Tom brady");
        Predicate<String> p = str -> {
            System.out.println("......");
            return str.length() >8;
        };
        boolean flag = ls.stream().filter(x -> x.length()>8).allMatch(p);
    }
}

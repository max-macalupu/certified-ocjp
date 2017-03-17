package org.oca;

import java.util.function.Predicate;

/**
 * Created by mx on 25/2/2017.
 */
public class Test {

    public static void main(String [] args){
//        System.out.println(test((int i) -> i == 5));
    }

    private static boolean test(Predicate<Integer> p){
        return p.test(5);
    }
}
package org.oca.mocks.whizlabs.trial;

import java.util.function.BiFunction;

/**
 * Created by mx on 11/3/2017.
 */
public class Question_23 {

    public static void main(String[] args) {

        int number1 = 3;
        int number2 = 5;
//        double number2 = 15;

        BiFunction<Integer, Integer, Integer> biFunction = (a,b) -> a*b;

        System.out.println(biFunction.apply(number1,number2));
    }
}

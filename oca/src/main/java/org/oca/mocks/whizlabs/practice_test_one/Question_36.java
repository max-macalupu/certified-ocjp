package org.oca.mocks.whizlabs.practice_test_one;

import java.util.function.UnaryOperator;

/**
 * Created by mx on 25/3/2017.
 */
public class Question_36 {

    private static final String text2 = "test";

    public static void main(String[] args) {

        String text = "word";
        text = text.toUpperCase();

//        UnaryOperator<String> unaryOperator = x -> x.concat(text);
        UnaryOperator<String> unaryOperator = x -> x.concat(text2);
        System.out.println(unaryOperator.apply(text));

    }
}
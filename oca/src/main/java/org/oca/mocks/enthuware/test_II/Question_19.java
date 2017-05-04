package org.oca.mocks.enthuware.test_II;

import java.util.function.UnaryOperator;

/**
 * Created by mx on 3/5/2017.
 */
public class Question_19 {

    public static void main(String[] args) {
        processThis();
    }

    private static void processThis(){
        String val = "Hello";
        StringBuilder stringBuilder = new StringBuilder(val);
        UnaryOperator<String> uo1 = s1 -> s1.concat(val);
        UnaryOperator<String> uo2 = s -> s.toUpperCase();
//        System.out.println(uo1.apply(uo2.apply(stringBuilder)));
    }
}
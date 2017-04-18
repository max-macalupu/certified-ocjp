package org.oca.mocks.whizlabs.test_IV;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * Created by mx on 18/4/2017.
 */
public class Question_35 {
    public static void main(String[] args) {
        processThisMethod();
    }

    private static void processThisMethod(){
        UnaryOperator<String> unaryOperator = UnaryOperator.identity();
        System.out.println(unaryOperator.apply("2"));
    }
}

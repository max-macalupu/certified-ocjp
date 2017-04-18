package org.oca.mocks.whizlabs.test_IV;

import java.util.function.IntBinaryOperator;

/**
 * Created by mx on 18/4/2017.
 */
public class Question_36 {
    public static void main(String[] args) {
        processThisMethod();
    }

    private static void processThisMethod(){
        IntBinaryOperator intBinaryOperator = Integer::compare;
        int x = intBinaryOperator.applyAsInt(1, 10);
        System.out.println(x);
    }
}

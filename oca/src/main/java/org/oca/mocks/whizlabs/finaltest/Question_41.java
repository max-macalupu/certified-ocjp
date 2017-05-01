package org.oca.mocks.whizlabs.finaltest;

import java.util.function.ToDoubleBiFunction;

/**
 * Created by mx on 29/4/2017.
 */
public class Question_41 {

    public static void main(String[] args) {
        process();
    }

    private static void process(){
        ToDoubleBiFunction<Integer, Integer> doubleBiFunction = (f1, f2) -> f1+f2;
        System.out.println(doubleBiFunction.applyAsDouble(1, 3));
    }
}

package org.oca.mocks.enthuware.test_II;

import java.util.function.Function;

/**
 * Created by mx on 3/5/2017.
 */
public class Question_39 {
    public static void main(String[] args) {
        processThisInterestingFunctionAsMethodLikeCode();
    }

    private static void processThisInterestingFunctionAsMethodLikeCode(){
        double doubleVal = 5;
        int intVal = 100;
        compute(doubleVal, (x) -> x*intVal*doubleVal);
    }

    private static void compute(double val, Function<Integer, Double> function){
        System.out.println(function.apply((int)val));
    }
}

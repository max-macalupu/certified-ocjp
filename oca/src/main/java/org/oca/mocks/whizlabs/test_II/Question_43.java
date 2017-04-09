package org.oca.mocks.whizlabs.test_II;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleFunction;

/**
 * Created by mx on 8/4/2017.
 */
public class Question_43 {
    public static void main(String[] args) {
        List<Float> floatList = Arrays.asList(1f, 5f, 6f, 1f , 3f);
        this_method_should_process_great(floatList);
    }

    private static  void this_method_should_process_great(List<?> awesomeData){
        DoubleFunction<Double> awesomeFunction = getDoubleFunctionToProcess();
        for(Object data: awesomeData){
            float number = (float) data;
            System.out.println(awesomeFunction.apply(number));
        }
    }

    private static DoubleFunction<Double> getDoubleFunctionToProcess(){
        DoubleFunction<Double> function = (d) -> d*d;
        return function;
    }
}
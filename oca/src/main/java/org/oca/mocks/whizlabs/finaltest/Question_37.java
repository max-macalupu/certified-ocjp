package org.oca.mocks.whizlabs.finaltest;

import java.util.HashMap;
import java.util.Map;
import java.util.function.ToDoubleBiFunction;

/**
 * Created by mx on 29/4/2017.
 */
public class Question_37 {
    public static void main(String[] args) {
        processThisAwesomeMethod();
    }

    private static void processThisAwesomeMethod(){
        Map<Integer, Double> doubleMap = new HashMap<>();
        doubleMap.put(1, 1.1);
        doubleMap.put(2, 2.2);
        doubleMap.put(1, 3.3);

        ToDoubleBiFunction<Double, Integer> intToDoubleFunction = (x, y) -> x + y;
        doubleMap.forEach((x,y) -> System.out.println(intToDoubleFunction.applyAsDouble(y,x)));
    }
}

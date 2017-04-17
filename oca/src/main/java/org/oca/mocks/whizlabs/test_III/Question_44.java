package org.oca.mocks.whizlabs.test_III;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

/**
 * Created by mx on 13/4/2017.
 */
public class Question_44 {
    public static void main(String[] args) {
        processThisInterestingMethod();
    }

    private static void processThisInterestingMethod(){
        BinaryOperator<String> binaryOperator = String::concat;
        Map<Integer, String> mapWithString = new HashMap<>();
        mapWithString.put(1, "A");
        mapWithString.put(2, "B");
        mapWithString.merge(2, "C", binaryOperator);
        mapWithString.merge(3, "D", binaryOperator);
        System.out.println(mapWithString);
    }
}

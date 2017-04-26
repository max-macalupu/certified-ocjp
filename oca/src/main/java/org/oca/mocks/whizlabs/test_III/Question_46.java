package org.oca.mocks.whizlabs.test_III;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

/**
 * Created by AVANTICA TECHNOLOGIES on 4/21/2017.
 */
public class Question_46 {
    public static void main(String[] args) {
        processThisAwesomeMethod();
    }

    private static void processThisAwesomeMethod(){
        BinaryOperator<String> binaryOperator = String::concat;
        Map<Integer, String> stringMap = new HashMap<>();
//        stringMap.put(1, "a");
        stringMap.put(1, null);
        stringMap.put(2, "b");
        stringMap.merge(2, "B", binaryOperator);
        stringMap.merge(1, null, binaryOperator);
        stringMap.merge(3, "C", binaryOperator);
        System.out.println(stringMap);
    }
}
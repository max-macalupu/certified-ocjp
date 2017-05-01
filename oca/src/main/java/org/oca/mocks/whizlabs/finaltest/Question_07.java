package org.oca.mocks.whizlabs.finaltest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mx on 29/4/2017.
 */
public class Question_07 {

    public static void main(String[] args) {
        testFunctionAsMethod();
    }

    private static void testFunctionAsMethod(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.remove("B");
        map.remove(3, "C");
        map.remove(4, "B");
        System.out.println(map);
    }
}
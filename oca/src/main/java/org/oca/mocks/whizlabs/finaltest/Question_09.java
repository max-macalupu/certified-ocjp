package org.oca.mocks.whizlabs.finaltest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mx on 29/4/2017.
 */
public class Question_09 {

    public static void main(String[] args) {
        processThisFunction();
    }

    private static void processThisFunction(){
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        map.merge("EF", 10, (k,v) -> v > 0?null:100);
        System.out.println(map.keySet());
    }
}

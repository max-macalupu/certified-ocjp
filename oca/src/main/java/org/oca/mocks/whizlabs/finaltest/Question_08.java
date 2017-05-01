package org.oca.mocks.whizlabs.finaltest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mx on 29/4/2017.
 */
public class Question_08 {
    public static void main(String[] args) {
        testFunction();
    }

    private static void testFunction(){
        Map<String,String> map = new HashMap<>();
        map.put("A","A");
        map.put("B","B");
        map.put("C","C");
        map.put("D","D");
        map.compute("D", (k,v) -> v.startsWith("C")?null:"A");
        System.out.println(map);
    }
}

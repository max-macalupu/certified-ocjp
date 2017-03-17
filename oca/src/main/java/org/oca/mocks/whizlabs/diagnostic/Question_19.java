package org.oca.mocks.whizlabs.diagnostic;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by max.macalupu on 3/17/2017.
 */
public class Question_19 {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("America", "United states");
        map.put("europe", "spain");
        map.merge("europe", "portugal", (a,b) -> b.concat(a));
//        map.merge("europe", "portugal", (a,b) -> a.concat(b));
        map.merge("africa", "nigeria", String::concat);

        System.out.println(map);
    }
}
package org.oca.mocks.whizlabs.test_II;

import java.util.*;

/**
 * Created by mx on 30/3/2017.
 */
public class Question_08 {
    public static void main(String[] args) {
        List<Map<String, String>> list = new ArrayList<>();
        list.add(new HashMap<>());
        Map<?,?> map = list.get(0);
//        Map<String,String> map = list.get(0);
//        map.put("","");
        processWilcard(map);
    }

    static void processWilcard(Map<?,?> map){
        for(Object dataKey: map.keySet()){
            System.out.println(dataKey);
            System.out.println(map.get(dataKey));
        }
    }
}
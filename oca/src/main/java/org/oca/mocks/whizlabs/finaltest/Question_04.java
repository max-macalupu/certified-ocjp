package org.oca.mocks.whizlabs.finaltest;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by mx on 29/4/2017.
 */
public class Question_04 {

    public static void main(String[] args) {
        processThisInteretingMethodAsFunction();
    }

    private static void processThisInteretingMethodAsFunction(){
        String []data = new String[2];
        data[1] = "test";
        ConcurrentHashMap<Integer,String> stringConcurrentHashMap = new ConcurrentHashMap<>();
        stringConcurrentHashMap.put(1, "1");
        stringConcurrentHashMap.putIfAbsent(2, "22");
//        stringConcurrentHashMap.put(2, "2");
        stringConcurrentHashMap.put(3, "3");
        stringConcurrentHashMap.put(4, "4");
        stringConcurrentHashMap.putIfAbsent(1, "11");
        System.out.println(stringConcurrentHashMap);

    }

}

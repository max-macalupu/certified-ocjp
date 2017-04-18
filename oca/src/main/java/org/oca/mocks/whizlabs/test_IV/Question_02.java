package org.oca.mocks.whizlabs.test_IV;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by AVANTICA TECHNOLOGIES on 4/17/2017.
 */
public class Question_02 {
    public static void main(String[] args) {
        processThisAwesomeMethod();
    }

    private static void processThisAwesomeMethod(){
        Map<Integer, String> concurrentHashMap = new ConcurrentHashMap<>( 100, 0.7f, 15);

        for(int i=0; i<new Random().nextInt(1000); i++){
            concurrentHashMap.put(i+1, "VALUE_"+(i+1));
        }
        System.out.println(concurrentHashMap);

    }
}

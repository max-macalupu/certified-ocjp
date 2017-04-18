package org.oca.mocks.whizlabs.test_IV;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by AVANTICA TECHNOLOGIES on 4/17/2017.
 */
public class Question_01 {
    public static void main(String[] args) {
        processThisAwesomeMethod();
    }

    private static void processThisAwesomeMethod(){
        processFirsOptionFunction();
        processSecondOptionFunction();
        processThirdOptionFunction();
        processFourstOptionFunction();
    }

    private static void processFourstOptionFunction() {
        ConcurrentHashMap<Integer, String> stringConcurrentHashMap = new ConcurrentHashMap<Integer,String>();
        stringConcurrentHashMap.put(1, "Hola");
        stringConcurrentHashMap.put(2, "Max");
        stringConcurrentHashMap.put(3, "Como Estas");

        stringConcurrentHashMap.replace(3, "Como Estas", "Bien y Tu");
        stringConcurrentHashMap.remove(3, "Mal ");
        System.out.println(stringConcurrentHashMap);
    }

    private static void processThirdOptionFunction() {
        HashMap<Integer, String> stringConcurrentHashMap = new HashMap<Integer, String>();
        stringConcurrentHashMap.put(1, "Hola");
        stringConcurrentHashMap.put(2, "Max");
        stringConcurrentHashMap.put(3, "Como Estas");

        stringConcurrentHashMap.replace(3, "Como Estas", "Bien y Tu");
        stringConcurrentHashMap.remove(3, "Mal ");
        System.out.println(stringConcurrentHashMap);

    }

    private static void processSecondOptionFunction() {
        Map<Integer, String> stringConcurrentHashMap = new ConcurrentHashMap<Integer, String>();
        stringConcurrentHashMap.put(1, "Hola");
        stringConcurrentHashMap.put(2, "Max");
        stringConcurrentHashMap.put(3, "Como Estas");

        stringConcurrentHashMap.replace(3, "Como Estas", "Bien y Tu");
        stringConcurrentHashMap.remove(3, "Mal ");
        System.out.println(stringConcurrentHashMap);
    }

    private static void processFirsOptionFunction() {
        ConcurrentMap<Integer, String> stringConcurrentHashMap = new ConcurrentHashMap<Integer,String>();
        stringConcurrentHashMap.put(1, "Hola");
        stringConcurrentHashMap.put(2, "Max");
        stringConcurrentHashMap.put(3, "Como Estas");

        stringConcurrentHashMap.replace(3, "Como Estas", "Bien y Tu");
        stringConcurrentHashMap.remove(3, "Mal ");
        System.out.println(stringConcurrentHashMap);
    }
}

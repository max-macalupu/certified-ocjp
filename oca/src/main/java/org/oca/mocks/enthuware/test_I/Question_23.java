package org.oca.mocks.enthuware.test_I;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by mx on 1/5/2017.
 */
public class Question_23 {

    static ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        processThisInterestingFunctionAsCode();
    }

    private static void processThisInterestingFunctionAsCode(){
        concurrentHashMap.put(1, "1");
        concurrentHashMap.put(2, "2");
        concurrentHashMap.put(3, "3");

        new Thread(){
            public void run(){
                Iterator<Entry<Integer, String>> entry = concurrentHashMap.entrySet().iterator();
                while (entry.hasNext()){
                    Entry<Integer, String > entry1 = entry.next();
                    if(entry1.getKey().equals(1) || entry1.getKey().equals(2)){
                        entry.remove();;
                    }
                }
            }
        }.start();

        new Thread(){
          public void run(){
              Iterator<Entry<Integer, String>> entry = concurrentHashMap.entrySet().iterator();
              while (entry.hasNext()) {
                  Entry<Integer, String> entry1 = entry.next();
                  System.out.println(entry1);
              }

          }
        }.start();
    }
}

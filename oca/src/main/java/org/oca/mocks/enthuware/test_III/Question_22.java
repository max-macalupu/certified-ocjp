package org.oca.mocks.enthuware.test_III;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mx on 6/5/2017.
 */
public class Question_22 {

    static Map<String, List<Double>> listListMap = new HashMap<>();

    public static void main(String[] args) {
        processThis();
    }

    private static void processThis(){
        process_01("test", 1.3);

        Question_22.listListMap.computeIfAbsent("test", (a) -> new ArrayList<>()).add(1.5);
        Question_22.listListMap.computeIfPresent("test", (a, b) -> {
           b.add(Double.parseDouble(""+a.length()));
           return b;
        });
        System.out.println(Question_22.listListMap);
    }

    private static void process_01(String name, Double value){
        List<Double> doubleList = Question_22.listListMap.get(name);
        if(doubleList==null){
            doubleList = new ArrayList<>();
            Question_22.listListMap.put(name, doubleList);
        }
        doubleList.add(value);
    }
}
package org.oca.mocks.whizlabs.test_IV;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mx on 17/4/2017.
 */
public class Question_13 {

    public static void main(String[] args) {
        processThisAwesomeMethod();
    }

    private static void processThisAwesomeMethod(){

        Map<String, String> mapWithData = new HashMap<>();
        mapWithData.put("A","1");
        mapWithData.put("B","2");

        Map<String, String> mapWithData2 = new HashMap<>();
        mapWithData2.put("B","2");
        mapWithData2.put("C","3");

        mapWithData.forEach((x,y) -> mapWithData2.merge(x, y, (i,j) -> j));

        System.out.println(mapWithData.keySet());
        System.out.println(mapWithData2.values());


    }
}
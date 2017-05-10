package org.oca.mocks.enthuware.final_test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_46 {
    public static void main(String[] args) {
        BinaryOperator<String> operator = (x,y) -> x.concat(y);
        List<String> stringList = new ArrayList<>();
        stringList.add("Max");stringList.add("Leo");stringList.add("Junior");
        String finalValue = stringList.stream().reduce("HelloWorld: ", operator);
        System.out.println(finalValue);
        Integer t = new Integer(4);
        t.intValue();
    }
}
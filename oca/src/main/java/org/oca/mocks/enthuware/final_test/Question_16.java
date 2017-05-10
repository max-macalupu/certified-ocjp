package org.oca.mocks.enthuware.final_test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_16 {

    public static void main(String[] args) {
        List<Double> doubleList = Arrays.asList(4.1, 6.4, 10.4, 3.3);
        DoubleFunction df = x -> x+10;
        Consumer<Object> consumer = x -> System.out.println(x.toString()+ " " + x.toString());
        doubleList.forEach(consumer);
//        doubleList.forEach(df);
        doubleList.forEach(d -> System.out.println(d));
    }
}
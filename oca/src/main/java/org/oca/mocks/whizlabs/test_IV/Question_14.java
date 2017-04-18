package org.oca.mocks.whizlabs.test_IV;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

/**
 * Created by mx on 17/4/2017.
 */
public class Question_14 {

    public static void main(String[] args) {
        processThisBeautyMethodAsFunction();
    }

    private static void processThisBeautyMethodAsFunction(){

        List<String> stringList = Arrays.asList("1.0", "2.2", "1.3", "2.3");
        DoubleStream doubleStream = stringList.stream().mapToDouble((s -> Double.valueOf(s))).filter(x -> x>1.8);
//        System.out.println(doubleStream.boxed().collect(Collectors.toList()));
        System.out.println(doubleStream.sum());
    }
}
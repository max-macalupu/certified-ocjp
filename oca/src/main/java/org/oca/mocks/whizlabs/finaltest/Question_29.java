package org.oca.mocks.whizlabs.finaltest;

import java.util.Arrays;
import java.util.stream.DoubleStream;

/**
 * Created by mx on 29/4/2017.
 */
public class Question_29 {

    public static void main(String[] args) {
        processThisInterestingFunction();
    }

    private static void processThisInterestingFunction(){

        double arr[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        DoubleStream doubleStream = Arrays.stream(arr, 3, 5);
        System.out.println(doubleStream.sum());
    }
}
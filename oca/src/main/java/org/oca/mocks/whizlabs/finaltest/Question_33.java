package org.oca.mocks.whizlabs.finaltest;

import java.util.Arrays;

/**
 * Created by mx on 29/4/2017.
 */
public class Question_33 {
    public static void main(String[] args) {
        tryThisInterestingFunction();
    }

    private static void tryThisInterestingFunction(){
        String[] list = {"1", "2", "3", "4"};
        Arrays.parallelSetAll(list, x -> Integer.toString(x) + list[x]);
        System.out.println(list[0]);
    }
}
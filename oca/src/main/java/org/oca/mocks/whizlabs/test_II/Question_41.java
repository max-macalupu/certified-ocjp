package org.oca.mocks.whizlabs.test_II;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mx on 24/4/2017.
 */
public class Question_41{
    public static void main(String[] args) {
        processThisInterestingMethodAsFunction();
    }

    private static void processThisInterestingMethodAsFunction(){
        List<String> stringList = Arrays.asList("a", "b", "c");
        stringList.forEach(x -> x.toLowerCase());
        stringList.stream().filter( x-> x.compareTo("b") > 0).forEach(System.out::print);
    }
}

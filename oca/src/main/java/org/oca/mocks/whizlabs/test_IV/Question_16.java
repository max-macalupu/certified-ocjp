package org.oca.mocks.whizlabs.test_IV;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mx on 17/4/2017.
 */
public class Question_16 {

    public static void main(String[] args) {
        processThisAwesomeMethodAsFunction();
    }

    private static void processThisAwesomeMethodAsFunction(){

        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");

        System.out.println(stringList.set(3, "7"));
    }
}

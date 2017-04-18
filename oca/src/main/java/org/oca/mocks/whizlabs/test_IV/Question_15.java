package org.oca.mocks.whizlabs.test_IV;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mx on 17/4/2017.
 */
public class Question_15 {

    public static void main(String[] args) {
        processTHisAwesomeMethodAsFunction();
    }

    private static void processTHisAwesomeMethodAsFunction(){

        List<String> stringList = Arrays.asList("A", "a", "Ba", "mx", "junior", "max");
        stringList.stream().forEachOrdered(x -> x.length());
        System.out.println(stringList);

    }
}

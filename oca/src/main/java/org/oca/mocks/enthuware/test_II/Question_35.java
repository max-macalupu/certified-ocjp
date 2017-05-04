package org.oca.mocks.enthuware.test_II;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mx on 3/5/2017.
 */
public class Question_35 {
    public static void main(String[] args) {
        processThis();
    }

    private static void processThis(){
        List<String> stringList = Arrays.asList("a", "b");
        System.out.println(stringList.parallelStream().reduce("_", (a,b) -> a.concat(b)));
    }
}

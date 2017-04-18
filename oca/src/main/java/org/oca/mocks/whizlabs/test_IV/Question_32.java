package org.oca.mocks.whizlabs.test_IV;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by mx on 18/4/2017.
 */
public class Question_32 {
    public static void main(String[] args) {
        processThisMethod();
    }

    private static void processThisMethod(){
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");

        Stream<Integer> integerStream=stringList.stream().map(x -> {
            System.out.println(x);
            return Integer.valueOf(x);
        });

        System.out.print("Count:");
        System.out.println(integerStream.count());
    }
}

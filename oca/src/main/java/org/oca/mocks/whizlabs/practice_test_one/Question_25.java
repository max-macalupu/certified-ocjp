package org.oca.mocks.whizlabs.practice_test_one;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by mx on 25/3/2017.
 */
public class Question_25 {
    public static void main(String[] args) {

        List<AtomicBoolean> atomicBooleanList = Arrays.asList(
          new AtomicBoolean(false)      ,
                new AtomicBoolean(true)
        );
        atomicBooleanList.stream().filter(a -> {System.out.println(a); return a.get();}).peek(a->  System.out.print("..." + a+"\n")).forEach(System.out::println);
    }
}
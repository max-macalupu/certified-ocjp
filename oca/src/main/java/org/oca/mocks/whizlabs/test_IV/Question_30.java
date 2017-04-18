package org.oca.mocks.whizlabs.test_IV;

import java.util.stream.IntStream;

/**
 * Created by mx on 18/4/2017.
 */
public class Question_30 {
    public static void main(String[] args) {
        processThisAwesomeMethod();
    }

    private static void processThisAwesomeMethod(){
        IntStream intStream = IntStream.iterate(10, x -> x*2).limit(3);
        System.out.println(intStream.sum());
    }
}

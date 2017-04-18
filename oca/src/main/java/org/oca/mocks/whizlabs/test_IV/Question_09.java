package org.oca.mocks.whizlabs.test_IV;

import java.util.stream.IntStream;

/**
 * Created by AVANTICA TECHNOLOGIES on 4/17/2017.
 */
public class Question_09 {
    public static void main(String[] args) {
        processThisBeautyMethodAsFunction();
    }

    private static void processThisBeautyMethodAsFunction(){
        IntStream intStream = IntStream.of(1, 6, 10, -2);
        System.out.println(intStream.filter(x -> x<0).findFirst().orElse(1));
    }
}
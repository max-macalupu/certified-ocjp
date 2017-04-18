package org.oca.mocks.whizlabs.test_IV;

import java.util.stream.Stream;

/**
 * Created by AVANTICA TECHNOLOGIES on 4/17/2017.
 */
public class Question_08 {
    public static void main(String[] args) {
        processthisAwesomeMethod();
    }

    private static void processthisAwesomeMethod(){
        Stream<Integer> integerStream = Stream.of(2, 0, 4, 1);
        Object[] data = integerStream.skip(2).limit(1).toArray();
        System.out.println(data[1]);
    }
}

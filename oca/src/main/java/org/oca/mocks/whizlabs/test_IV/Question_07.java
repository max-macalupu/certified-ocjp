package org.oca.mocks.whizlabs.test_IV;

import java.util.stream.Stream;

/**
 * Created by AVANTICA TECHNOLOGIES on 4/17/2017.
 */
public class Question_07 {
    public static void main(String[] args) {
        processThisAwesomeMethod();
    }

    private static void processThisAwesomeMethod(){
        Stream<Integer> stream = Stream.of(1, 5, 7, 19, 20);
        System.out.println(stream.peek(x -> x++).count());
    }
}

package org.oca.mocks.whizlabs.diagnostic;

import java.util.stream.Stream;

/**
 * Created by mx on 18/3/2017.
 */
public class Question_57 {

    public static void main(String[] args) {
        Stream.of(1,2,3,4).map(a-> a+5).peek(System.out::print).count();
    }
}
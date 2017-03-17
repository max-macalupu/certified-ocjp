package org.oca.mocks.whizlabs.trial;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by mx on 11/3/2017.
 */
public class Question_24 {

    public static void main(String[] args) {
        Arrays.asList(1,2,4).stream().peek(System.out::println).allMatch(x -> x<2);
    }

}

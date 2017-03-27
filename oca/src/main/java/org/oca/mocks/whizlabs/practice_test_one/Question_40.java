package org.oca.mocks.whizlabs.practice_test_one;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mx on 25/3/2017.
 */
public class Question_40 {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 6, 2, 6);
        integerList.forEach(i -> {i*=2; System.out.println(i);});
    }
}
package org.oca.mocks.whizlabs.test_III;

import java.util.Arrays;
import java.util.List;

/**
 * Created by AVANTICA TECHNOLOGIES on 4/11/2017.
 */
public class Question_34 {
    public static void main(String[] args) {
        processThisInterestingMethodOfArrayInteger();
    }

    private static void processThisInterestingMethodOfArrayInteger(){
        List<Integer> integerList = Arrays.asList(1, 5, 2, 6 ,9, 10);
        System.out.println(integerList.stream().mapToInt(x -> x).boxed().mapToInt(x->x).sum());
    }
}

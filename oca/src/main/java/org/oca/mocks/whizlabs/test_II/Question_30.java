package org.oca.mocks.whizlabs.test_II;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mx on 24/4/2017.
 */
public class Question_30 {
    public static void main(String[] args) {
        processThisAwesomeFunctionAsHighQualityCode();
    }

    private static void processThisAwesomeFunctionAsHighQualityCode(){
        List<Integer> integerList = Arrays.asList(1, 5, 10, 4, 1, 3);
        long count = integerList.stream().filter(i -> i%2==0).count();
        System.out.println(count);
    }
}

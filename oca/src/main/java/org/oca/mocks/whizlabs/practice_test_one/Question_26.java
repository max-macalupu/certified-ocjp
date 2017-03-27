package org.oca.mocks.whizlabs.practice_test_one;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mx on 25/3/2017.
 */
public class Question_26 {

    public static void main(String[] args) {
        List<Integer> listIntegerOne = Arrays.asList(1,5,6,8);
        List<Integer> listIntegerTwo = Arrays.asList(1,5,6,8);

//        int sumZero = listIntegerOne.stream().mapToDouble((a) -> a).sum();
        double sumOne = listIntegerOne.stream().mapToDouble((a) -> a).sum();
        double sumTwo = listIntegerTwo.stream().mapToInt(z-> z).sum();

        System.out.println(sumOne + "  " +sumTwo);

    }

}

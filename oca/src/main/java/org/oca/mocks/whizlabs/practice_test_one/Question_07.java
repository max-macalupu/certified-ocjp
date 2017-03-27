package org.oca.mocks.whizlabs.practice_test_one;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mx on 26/3/2017.
 */
public class Question_07 {
    public static void main(String[] args) {
        List<? super Number> listOfNumber = new ArrayList<>();
        List<? extends Number> list2 = new ArrayList<>();
        listOfNumber.add(1);
//        list2.add(new Object(null));
    }
}
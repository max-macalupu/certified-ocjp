package org.oca.mocks.enthuware.test_III;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mx on 10/5/2017.
 */
public class Question_20 {
    public static void main(String[] args) {
        List<Integer> names = Arrays.asList(1, 2, 4);
        for(Integer integer: names){
            integer++;
        }
//        names.forEach(x -> x=x+1);
        names.forEach(System.out::println);
    }
}

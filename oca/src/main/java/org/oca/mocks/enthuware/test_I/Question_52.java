package org.oca.mocks.enthuware.test_I;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by mx on 1/5/2017.
 */
public class Question_52 {
    public static void main(String[] args) {
        processThus();
    }

    private static void processThus(){
        List<Integer> integerList = Arrays.asList(3, 1, 5, 8, 10, 4, 4);
        Predicate<Integer> check = (Integer i) -> {
            System.out.println("Checking");
            return i == 4;
        };
        Predicate<Integer> predicate = (Integer i) -> i%2==0;
        long data = integerList.stream().filter(check).filter(predicate).count();
        System.out.println(data);
    }
}
package org.oca.mocks.whizlabs.diagnostic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by mx on 18/3/2017.
 */
public class Question_48 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for(int i=0; i<100; i++){
            integerList.add(i+1);
        }
        List<Integer> integerFromList = integerList.stream()
//                .filter(x -> x%2==0)
                .filter( x-> x%3==0)
//                .filter(x->x%4==0)
                .filter(x->x%5==0)
                .filter(x->x%7==0)
                .collect(Collectors.toList());
        System.out.println(integerFromList);
    }
}
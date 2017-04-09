package org.oca.mocks.whizlabs.test_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

/**
 * Created by mx on 8/4/2017.
 */
public class Question_39 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
        should_this_method_process_the_question(integerList, 2);
    }

    private static void should_this_method_process_the_question(List<Integer> list, Integer filter){
        List<Integer> finalResult = getBiFunctionToProcessThisQuestion().apply(list, filter);
        System.out.println(finalResult);
    }

    private static BiFunction<List<Integer>, Integer, List<Integer>> getBiFunctionToProcessThisQuestion(){
        BiPredicate<Integer, Integer> biPredicate = (x,y) -> x%y==0;
        BiFunction<List<Integer>, Integer, List<Integer>> biFunction = (x, y) ->{
            List<Integer> list1 = new ArrayList<>();
            for(Integer data: x){
                if(biPredicate.test(data, y)){
                    list1.add(data/y);
                }
            };
            return list1;
        };
        return  biFunction;
    }
}
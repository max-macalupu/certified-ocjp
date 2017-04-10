package org.oca.mocks.whizlabs.test_III;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * Created by mx on 9/4/2017.
 */
public class Question_01 {
    public static void main(String[] args) {
        should_this_method_work_with_static();
    }

    private static void should_this_method_work_with_static(){
        process_method_with_list_option_I();
        process_method_with_list_option_II();
    }

    private static void process_method_with_list_option_I(){
        List<Integer> integerList = new ArrayList<>();
        integerList.addAll(Arrays.asList(1, 4, 6, 7));
        List<? extends Number> numbersList = process_original_method(integerList);
        System.out.println(numbersList);
    }

    private static void process_method_with_list_option_II(){
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.addAll(Arrays.asList(5, 1 ,7 ,2));
        List<? super Integer> numberList = process_original_method(integerList);
        System.out.println(numberList);
    }

    private static <T extends Number>List<T> process_original_method(List<T> args){
        ArrayList<Integer> integerList = new ArrayList<>();
        List<? extends Integer> numberList = new ArrayList<>(integerList);
        return args;
    }
}
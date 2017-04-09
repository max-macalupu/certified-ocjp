package org.oca.mocks.whizlabs.test_II;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * Created by mx on 8/4/2017.
 */
public class Question_46 {
    public static void main(String[] args) {
        run_this_awesome_method_because_it_worth();
        run_this_awesome_integer_method_because_it_worth();
    }


    private static void run_this_awesome_method_because_it_worth(){
        List<String> stringList = Arrays.asList("A", "B", "C");
        UnaryOperator<String> unaryOperator = (x) -> x.toLowerCase();
        stringList.stream().map(unaryOperator).forEach(System.out::print);
        System.out.println();
        System.out.println(stringList);
    }
    private static void run_this_awesome_integer_method_because_it_worth(){
        List<Integer> integerList = Arrays.asList(1, 4, 8);
        UnaryOperator<Integer> unaryOperator = (x) -> x*x;
        integerList.stream().map(unaryOperator).forEach(System.out::print);
        System.out.println();
        System.out.println(integerList);
    }
}

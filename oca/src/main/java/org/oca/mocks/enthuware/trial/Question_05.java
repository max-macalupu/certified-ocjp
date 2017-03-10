package org.oca.mocks.enthuware.trial;

import java.util.Arrays;
import java.util.List;

/**
 * Created by max.macalupu on 3/9/2017.
 */
public class Question_05 {

    public static Integer validateMax(Integer a, Integer b) {
        int compareResult = Math.max(a, b);
        return compareResult;
    }

     public static Integer validateGreates(Integer a, Integer b){
          int compareResult= Integer.compare(a,b);
          return compareResult;
     }

    public static void main(String[] args) {
        List<Integer> streamOfInteger = Arrays.asList(5, 8, 3, 6, 9, 7, 1, 2, 4, 10);
        System.out.println(streamOfInteger.stream().max(Integer::max).get());

        System.out.println(streamOfInteger.stream().reduce(Integer.MIN_VALUE, (a,b) -> a>b?a:b));
        System.out.println(streamOfInteger.stream().reduce(Integer::max).get());

//        System.out.println(streamOfInteger.stream().max(Integer::compareTo).get());

        System.out.println(streamOfInteger.stream().filter(a -> a>6).max(Question_05::validateMax).get());

//        System.out.println(streamOfInteger.stream().max(Integer::max));

        System.out.println(streamOfInteger.stream().max(Question_05::validateGreates).get());
    }
}
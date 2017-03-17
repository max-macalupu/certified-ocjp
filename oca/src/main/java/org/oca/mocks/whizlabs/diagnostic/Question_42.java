package org.oca.mocks.whizlabs.diagnostic;

import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 * Created by max.macalupu on 3/17/2017.
 */
public class Question_42 {

    public static void main(String[] args) {

        IntPredicate predicate = (x -> x%2==0);
        Predicate<Integer> predicateOther = (x) -> x%2==0;

        System.out.println(""+
                IntStream.range(0,1).allMatch(predicate) +
                IntStream.range(0,1).anyMatch(predicate) +
                IntStream.range(0,1).noneMatch(predicate)

        );
    }

}

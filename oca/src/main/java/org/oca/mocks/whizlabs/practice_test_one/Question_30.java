package org.oca.mocks.whizlabs.practice_test_one;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by mx on 25/3/2017.
 */
public class Question_30 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,4,6,7,8);
//        Optional<Integer> integerOptional = Optional.of(list.stream().filter(x -> x%2==0).reduce((a,b) -> a+b));
        Optional<Optional<Integer>> integerOptionalTwo = Optional.of(list.stream().filter(x -> x%2==0).reduce((a,b) -> a+b));
        Optional<Integer> integerOptiona = list.stream().filter(x -> x%2==0).reduce((a,b) -> a+b);
    }
}
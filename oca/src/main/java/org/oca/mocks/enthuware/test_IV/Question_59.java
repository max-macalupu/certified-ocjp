package org.oca.mocks.enthuware.test_IV;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by mx on 8/5/2017.
 */
public class Question_59 {
    public static void main(String[] args) {
        List<Integer> integerStream = Arrays.asList(2, 5, 10, 6, 3, 9, 103);
        processFirstOption(integerStream.stream());
        System.out.println();
        processSecondOption(integerStream.stream());
        System.out.println();
        processThirdOption(integerStream.stream());

//        DateFormat dateFormat = new DateFormat(DateFormat.LONG);
    }

    private static void processFirstOption(Stream<Integer> integerStream){
        Stream<Integer> integerStream2 = integerStream.filter(x -> { return x>5 && x<10;});
        integerStream2.forEach(System.out::print);
    }
    private static void processSecondOption(Stream<Integer> integerStream){
        Stream<Integer> integerStream2 = integerStream.filter(x ->x>5).filter(x-> x<10).sequential();
        integerStream2.forEach(System.out::print);
    }
    private static void processThirdOption(Stream<Integer> integerStream){
        Stream<Integer> integerStream2 = integerStream.collect(Collectors.
                                                partitioningBy(x -> {return  x> 5 && x <10;})).get(true).stream();
        integerStream2.forEach(System.out::print);
    }
}

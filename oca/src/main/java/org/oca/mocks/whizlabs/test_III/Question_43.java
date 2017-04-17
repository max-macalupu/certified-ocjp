package org.oca.mocks.whizlabs.test_III;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * Created by mx on 12/4/2017.
 */
public class Question_43 {
    public static void main(String[] args) {
        processThisInterestingMethod();
    }

    private static void processThisInterestingMethod(){
        Stream<String> stringStream = Stream.of("United", "States");
        BinaryOperator<String> binaryOperator = (a,b) -> a.concat(b.toUpperCase());
        String result = stringStream.reduce("-",binaryOperator) ;
        System.out.println(result);

        Stream<String> stringStream_II = Stream.of("United", "States");
        BinaryOperator<String> binaryOperator_II = (a,b) -> a.concat(b);
        String result_II = stringStream_II.reduce("-",binaryOperator_II) ;
        System.out.println(result_II);

        Stream<String> stringStream_III = Stream.of("United", "States");
        BinaryOperator<String> binaryOperator_III = (a,b) -> a.toUpperCase().concat(b).concat(a.toLowerCase());
        String result_III = stringStream_III.reduce("-",binaryOperator_III) ;
        System.out.println(result_III);
    }
}
package org.oca.mocks.whizlabs.test_IV;

import java.util.stream.Stream;

/**
 * Created by mx on 18/4/2017.
 */
public class Question_28 {

    public static void main(String[] args) {
        processThisMethodAsAwesomeFunction();
    }

    private static void processThisMethodAsAwesomeFunction(){
        Stream<String> stringStream = Stream.of("1","2","3","2","1").distinct();
        String finalTarget = stringStream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
        System.out.println(finalTarget);
    }
}
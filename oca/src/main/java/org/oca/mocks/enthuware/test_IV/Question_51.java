package org.oca.mocks.enthuware.test_IV;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by mx on 8/5/2017.
 */
public class Question_51 {
    public static void main(String[] args) {

        String sentence = "This is my upgrade test for the OCJP certificacion, I'm very excited about it";
//        Optional<String> optional = Stream.of(sentence.split("[ ,.]]")).anyMatch(x -> x.startsWith("t"));
        String[] data = sentence.split("[ ,.]");
        Arrays.stream(data).forEach(System.out::println);
        boolean bool = Stream.of(data).anyMatch(x -> x.startsWith("t"));
        boolean bool2 = Arrays.stream(data).anyMatch(x -> x.startsWith("t"));
        System.out.println(bool + " " + bool2);
    }
}
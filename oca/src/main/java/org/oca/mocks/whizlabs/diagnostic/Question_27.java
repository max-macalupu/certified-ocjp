package org.oca.mocks.whizlabs.diagnostic;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by max.macalupu on 3/17/2017.
 */
public class Question_27 {
    public static void main(String[] args) {

        Arrays.asList("Jhon","Max","Leo").stream().map(data-> "sun".concat(data)).forEach(System.out::println);
        Stream.of("Jhon","Max","Leo").map(data-> "sun".concat(data)).forEach(System.out::println);

    }
}
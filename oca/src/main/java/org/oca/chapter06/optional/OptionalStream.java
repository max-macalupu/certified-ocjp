package org.oca.chapter06.optional;

import java.util.Optional;

/**
 * Created by max.macalupu on 2/22/2017.
 */
public class OptionalStream {

    public static void test_simple_optional(String optionaString){
        Optional<String> optionString = Optional.of(optionaString);
        optionString.map(String::trim).ifPresent(System.out::println);
    }

    public static void test_simple_optional_null(String optionaString){
        Optional<String> optionString = Optional.ofNullable(null);
        System.out.print(optionString.map(String::length).orElse(-1));
    }

    public static void test_simple_optional_null_throws(String optionaString){
        Optional<String> optionString = Optional.ofNullable(null);
        System.out.print(optionString.map(String::length).orElseThrow(IllegalArgumentException::new));
    }

    public static void main(String [] args){
        test_simple_optional("          masdmasdamsd        ");
        test_simple_optional_null("          masdmasdamsd        ");
        test_simple_optional_null_throws("          masdmasdamsd        ");
    }
}
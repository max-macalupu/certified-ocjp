package org.oca.chapter6.optional;

import java.util.Optional;

/**
 * Created by max.macalupu on 2/22/2017.
 */
public class OwnObject {

    public static void main(String [] args){

        Optional<String> optionalString = Optional.empty();
        Optional<String> optionalString_null = Optional.of("Hello world option");
//        Optional<String> optionalString_null_second_way = Optional.of(null);
        Optional<String> optionalString_null_third_way = Optional.ofNullable(null);

        System.out.println(optionalString.orElse("nothing to show"));
        System.out.println(optionalString_null.orElse("nothing to show"));
//        System.out.println(optionalString_null_second_way.orElse("nothing to show"));
        System.out.println(optionalString_null_third_way.orElse("nothing to show"));
    }
}
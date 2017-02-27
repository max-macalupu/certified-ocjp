package org.oca.chapter06.find;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

/**
 * Created by max.macalupu on 2/22/2017.
 */
public class FindFirstUse2 {
    public static void main(String [] args){
        OptionalDouble optionalDouble = DoubleStream.of(-4.1, -5.3, -0.5, 6, 0.3, 10.2).filter( x-> x > 0).findAny();
        System.out.println("Value of Optiona Double: " + optionalDouble.orElse(-99999));
    }
}
package org.oca.mocks.whizlabs.diagnostic;

import java.util.function.Function;

/**
 * Created by mx on 18/3/2017.
 */
public class Question_46 {

    public static void main(String[] args) {
        int base = 32;
        double longValue = calculate(base, x -> (double) base * 10);
        System.out.println(longValue);
    }

    static Double calculate(int base, Function<Long, Double> func){
        return func.apply((long) base);
    }
}
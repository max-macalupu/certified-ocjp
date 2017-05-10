package org.oca.mocks.enthuware.final_test;


import java.util.Optional;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_06 {
    public static void main(String[] args) {
        Optional<Double> price = Optional.ofNullable(getPrice("33"));
        Double data = price.orElse(getPrice("31"));
        System.out.println(data);

        Optional<Double> price2 = Optional.ofNullable(getPrice("31"));
        Double y = price2.orElseGet(() -> getPrice("31"));
        System.out.println(y);
    }

    private static Double getPrice(String data){
        Double data2 = null;
        return data2;
    }
}

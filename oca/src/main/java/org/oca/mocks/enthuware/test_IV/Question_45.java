package org.oca.mocks.enthuware.test_IV;

import java.util.function.Predicate;

/**
 * Created by mx on 8/5/2017.
 */
public class Question_45 {
    public static void main(String[] args) {
        double val = 10.5;
        boolean bool = new Validator_Q45(){
            @Override
            public boolean validate(double val) {
                return val > 10;
            }
        }.validate(val);
        System.out.println(bool);

        Validator_Q45 predicate = x -> x>10;
        System.out.println(predicate.validate(val));

        Predicate<Double> predicate1 = x -> x>10;
        System.out.println(predicate1.test(val));
    }
}

interface Validator_Q45{
    boolean validate(double val);
}

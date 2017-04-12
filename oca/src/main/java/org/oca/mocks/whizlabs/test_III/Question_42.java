package org.oca.mocks.whizlabs.test_III;

/**
 * Created by mx on 12/4/2017.
 */
public class Question_42 {
    public static void main(String[] args) {
        process_this_interesting_method();
    }

    private static void process_this_interesting_method(){
        Double origin = 100D;
        Double target = 0.1D;
        calculate(origin, target, new PlayBack_Q42<Double>() {
            @Override
            public Double applyFunction(Double origin, Double target) {
                return origin*(1+target);
            }
        }::applyFunction);

        calculate(origin, target, (a,b) -> (a+b)*(1+b*a));
        calculate(origin, target, (a,b) -> origin*origin*(1+target));
    }

    private static void calculate(Double origin, Double target, PlayBack_Q42<Double> function){
        double playBack = function.applyFunction(origin, target);
        System.out.println(playBack);
    }
}

interface PlayBack_Q42<T>{
    T applyFunction(T origin, T target);
}

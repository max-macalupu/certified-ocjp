package org.oca.mocks.enthuware.final_test;

import java.util.function.Function;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_02 {
    public static void main(String[] args) {
        System.out.println(process(10.5, 10));
    }

    private static double process(double payment, int rate){
        double defaultRate = 0.10;
//        if(rate>10) defaultRate = rate;

        class Implement{
            double defaultRate2 = 0.15;
            public int apply(double data){
                defaultRate2 = defaultRate2++;
                Function<Integer,Integer> f = x -> x+(int)(x*defaultRate2);
                return f.apply((int)data);
            }
        }

        Implement i = new Implement();
        return i.apply(defaultRate);
    }
}

class Test_Q02{
    double defaultValue = 0.15;

    public int apply(double data){
        defaultValue = 321;
        defaultValue = 321;
        double defaultVal = 0.65;
//        defaultVal = 4.5;
        Function<Integer, Integer> x = y -> y + (int) (y * defaultValue);
        return x.apply((int)data);
    }
}
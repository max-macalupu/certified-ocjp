package org.oca.mocks.whizlabs.test_IV;

import java.util.function.Function;

/**
 * Created by mx on 18/4/2017.
 */
public class Question_38 {
    public static void main(String[] args) {
        processMethod();
    }

    private static void processMethod(){
        Function<Integer, Integer> t = Function.identity();
        System.out.println(t.apply(1));
    }
}

interface testInterface{
    void method(Integer a);
}

class Test_Q38 implements testInterface{

    @Override
    public void method(Integer a) {

    }
}

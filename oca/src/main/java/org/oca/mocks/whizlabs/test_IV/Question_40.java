package org.oca.mocks.whizlabs.test_IV;

import java.util.function.Function;

/**
 * Created by mx on 18/4/2017.
 */
public class Question_40 {
    public static void main(String[] args) {
        process();
    }

    private static void process(){
        Funcational_Q40<String, Integer> xxFuncational = String::length;
        System.out.println(xxFuncational.acceptClaro("ssss"));
    }
}

interface Funcational_Q40<T,V>{
    V acceptClaro(T t);
}

package org.oca.mocks.whizlabs.finaltest;

/**
 * Created by mx on 29/4/2017.
 */
public class Question_36 {
    public static void main(String[] args) {
        process();
    }

    private static void process(){
        Func_Q36<Integer> fun = System.out::print;
    }
}

interface Func_Q36<T> {
    public abstract void accept(T t);
}

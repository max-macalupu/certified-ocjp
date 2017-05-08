package org.oca.mocks.enthuware.test_III;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by mx on 5/5/2017.
 */
public class Question_10 {
    public static void main(String[] args) {
        processThisCode();
        processThisFunction();
    }

    private static void processThisCode(){
        Function<Integer,MyProcessor_Q10> processor_q10Function = MyProcessor_Q10::new;
        MyProcessor_Q10 processor_q10 = processor_q10Function.apply(10);
        processor_q10.process();
    }

    private static void processThisFunction(){
        Supplier<MyProcessor_Q10> processor = MyProcessor_Q10::new;
        MyProcessor_Q10 myProcessor_q10 =  processor.get();
        myProcessor_q10.process();
    }
}

class MyProcessor_Q10{
    int value;

    public MyProcessor_Q10(int value) {
        this.value = value;
    }

    public void process(){
        System.out.println("processing");
    }

    public MyProcessor_Q10() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
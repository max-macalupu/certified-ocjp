package org.oca.mocks.whizlabs.test_II;

/**
 * Created by mx on 24/4/2017.
 */
public class Question_02 {

    public static void main(String[] args) {
        processThisAwesomeFunction();
    }

    private static void processThisAwesomeFunction(){
        new Counter_Q02().increment();
    }
}

class Counter_Q02{
    private /*synchronized*/  int increment;
    public void increment(){
        increment++;
    }
}
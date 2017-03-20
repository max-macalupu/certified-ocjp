package org.oca.mocks.whizlabs.diagnostic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by mx on 19/3/2017.
 */
public class Question_11 {

    public static void main(String[] args) {

        MyApp myApp = new MyApp();
        myApp.atomicInteger.get();
        myApp.atomicInteger.compareAndSet(0,9);


    }

}

class MyApp{
    public AtomicInteger atomicInteger = new AtomicInteger();
}

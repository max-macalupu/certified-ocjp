package org.oca.chapter11.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by mx on 16/2/2017.
 */
public class AtomicVariableTest {

    static class Increment extends Thread{
        public void run(){
            Counter.normalInteger ++ ;
            Counter.atomicInteger.incrementAndGet();
        }
    }

    static class Decrement extends Thread{
        public void run(){
            Counter.normalInteger -- ;
            Counter.atomicInteger.decrementAndGet();
        }
    }

    public static void main(String [] args) throws InterruptedException {
        Thread[] incrementArray = new Increment[10000];
        Thread[] decrementArray = new Decrement[10000];

        for(int i=0; i<incrementArray.length; i++){
            incrementArray[i] = new Increment();
            decrementArray[i] = new Decrement();
            incrementArray[i].start();
            decrementArray[i].start();
        }

        System.out.println("Changes in counter: NORMAL " +Counter.normalInteger);
        System.out.println("Changes in counter: ATOMIC " +Counter.atomicInteger.get());

        for(int i=0; i<decrementArray.length; i++){
            incrementArray[i].join();
            decrementArray[i].join();
        }

        System.out.println("Changes in counter: NORMAL " +Counter.normalInteger);
        System.out.println("Changes in counter: ATOMIC " +Counter.atomicInteger.get());
    }
}

class Counter{
    public static AtomicInteger atomicInteger = new AtomicInteger(0);
    public static Integer normalInteger = new Integer(0);
}
package org.oca.chapter11.deadlock;

/**
 * Created by mx on 22/1/2017.
 */
public class DeadLock {

    public static void main(String [] args){
        Counter counter = new Counter();

        Thread thread_1 = new Thread(counter);
        Thread thread_2 = new Thread(counter);

        thread_1.start();
        thread_2.start();
    }
}
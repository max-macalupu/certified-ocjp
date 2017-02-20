package org.oca.chapter11.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by mx on 16/2/2017.
 */
public class AtomicThread implements Runnable {

    public static AtomicInteger atomicInteger = new AtomicInteger(1);
    public static Integer normalInteger = new Integer(1);

    @Override
    public void run() {
//        synchronized (AtomicThread.class){
            System.out.println("Thread 02: " + normalInteger ++ + ", ");
            System.out.println("Thread 01: " + AtomicThread.atomicInteger.getAndIncrement()+ ", ");
//        }
    }

    public static void main(String [] args){
        Thread thread = new Thread(new AtomicThread());
        thread.start();
        Thread thread_1 = new Thread(new AtomicThread());
        thread_1.start();
        Thread thread_2 = new Thread(new AtomicThread());
        thread_2.start();
        Thread thread_3 = new Thread(new AtomicThread());
        thread_3.start();
    }
}
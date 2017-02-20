package org.oca.chapter11.thread;

/**
 * Created by mx on 22/1/2017.
 */
public class ThreadTest {

    public static void main(String [] args){
        String threadName = new Thread().getName();
        String threadName_1 = new Thread().getName();
        String currentThread = Thread.currentThread().getName();

        System.out.println(threadName);
        System.out.println(threadName_1);
        System.out.println(currentThread);
    }
}
package org.oca.chapter11.thread;

/**
 * Created by mx on 22/1/2017.
 */
public class MyThreadRunnable implements Runnable {

    @Override
    public void run() {
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The name of this Thread is: "+Thread.currentThread().getName());
    }

    public static void main(String [] args){
        Thread thread = new Thread(new MyThreadRunnable());
        thread.start();
        System.out.println("The name of the Main Thread is: "+Thread.currentThread().getName());
    }
}

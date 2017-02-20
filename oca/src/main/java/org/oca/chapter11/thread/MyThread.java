package org.oca.chapter11.thread;

/**
 * Created by mx on 22/1/2017.
 */
public class MyThread extends Thread {

    public void run(){
        try{
            sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The name of this Thread is: "+getName());
    }

    public static void main(String [] args){
        Thread thread = new MyThread();
        thread.start();
        System.out.println("The name of the Main Thread is: "+Thread.currentThread().getName());
    }
}
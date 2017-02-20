package org.oca.chapter11.racecondition;

/**
 * Created by mx on 22/1/2017.
 */
public class RaceCounter implements Runnable{

    @Override
    public void run() {
        increment();
        increment();
        increment();
    }

    public synchronized void increment(){
//        synchronized (this){
//        System.out.println("Thread is: "+Thread.currentThread().getName());
            Transaction.count++;
//        System.out.println("Number Transaction is: "+Transaction.count);
            System.out.print(Transaction.count+", ");
//        }
    }

    public static void main(String [] args){
        RaceCounter raceCounter = new RaceCounter();
        Thread thread = new Thread(raceCounter);
        thread.start();

        Thread thread_2 = new Thread(raceCounter);
        thread_2.start();

        Thread thread_3 = new Thread(raceCounter);
        thread_3.start();

        Thread thread_4 = new Thread(raceCounter);
        thread_4.start();

        Thread thread_5 = new Thread(raceCounter);
        thread_5.start();

        Thread thread_6 = new Thread(raceCounter);
        thread_6.start();
    }
}
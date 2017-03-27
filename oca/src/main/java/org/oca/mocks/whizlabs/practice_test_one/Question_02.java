package org.oca.mocks.whizlabs.practice_test_one;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by mx on 22/3/2017.
 */
public class Question_02 {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2, new Runnable(){
            @Override
            public void run() {
                System.out.println("Here is the Thread inside of cyclicBarrier");
            }
        });
        new MyApp_Q2(cyclicBarrier);
    }
}

class MyApp_Q2{
    private CyclicBarrier cyclicBarrier;

    public MyApp_Q2(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
        new Thread(new Worker(1)).start();
        new Thread(new Worker(2)).start();
    }

    class Worker implements Runnable{
        private int id;

        public Worker(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            System.out.println("Thread " + id + " is running.");
            try{
                cyclicBarrier.await();
            } catch (InterruptedException|BrokenBarrierException e) {
                e.printStackTrace();
            } finally {

            }
        }
    }

}
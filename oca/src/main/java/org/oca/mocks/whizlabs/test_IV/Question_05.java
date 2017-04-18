package org.oca.mocks.whizlabs.test_IV;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by AVANTICA TECHNOLOGIES on 4/17/2017.
 */
public class Question_05 {
    public static void main(String[] args) {
        processThisFuckMethod();
    }

    private static void processThisFuckMethod(){
        DCForce_Q05 dcForce_q05 = new DCForce_Q05();

        Thread thread = new Thread(dcForce_q05);
        Thread thread1 = new Thread(dcForce_q05);

        thread.start();
        thread1.start();

    }

    private static class DCForce_Q05 implements Runnable{
        private int x = 1;
        private AtomicInteger atomicInteger = new AtomicInteger(10);

        @Override
        public void run() {
            while(x > 0){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (this){
                    x = atomicInteger.decrementAndGet();
                    System.out.println(atomicInteger + " " + Thread.currentThread().getName());
                }
            }
        }
    }
}

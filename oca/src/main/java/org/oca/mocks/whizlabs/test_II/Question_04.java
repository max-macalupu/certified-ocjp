package org.oca.mocks.whizlabs.test_II;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by mx on 24/4/2017.
 */
public class Question_04 {

    public static final int THREAD_NUMBER = 10000;

    public static void main(String[] args) throws InterruptedException {
        executeThisIncredibleFunctionAsMethod();
    }

    private static void executeThisIncredibleFunctionAsMethod() throws InterruptedException {
        ExecutorService executorService = Executors.newWorkStealingPool(THREAD_NUMBER);
//        ExecutorService executorService = Executors.newFixedThreadPool(100);
        for(int i=0; i<THREAD_NUMBER; i++){
            executorService.submit(new StockStack_Q04());
//            executorService.execute(new StockStack_Q04());
        }
//        executorService.shutdown();
//        executorService.isTerminated();
        executorService.awaitTermination(2, TimeUnit.SECONDS);
        System.out.println(StockStack_Q04.getAtomicIntegerValue());
    }
}

class StockStack_Q04 implements Runnable{
    private static AtomicInteger atomicInteger = new AtomicInteger();

    @Override
    public void run() {
        int data = atomicInteger.get();
        try {
            Thread.sleep(ThreadLocalRandom.current().nextLong(1, 5)*100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int dataMod = atomicInteger.addAndGet(1);
//        int dataMod = atomicInteger.addAndGet(atomicInteger.get() + 1);
        if(!(data == dataMod)){
//            System.out.println("Changed");
        }
    }
    public static AtomicInteger getAtomicIntegerValue(){
        return atomicInteger;
    }
}
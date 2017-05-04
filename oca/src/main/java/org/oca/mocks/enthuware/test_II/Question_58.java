package org.oca.mocks.enthuware.test_II;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by mx on 3/5/2017.
 */
public class Question_58 {
    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        Merge_Q58 merge_q58 = new Merge_Q58();
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2, merge_q58);
        ItemProcessor_Q58 itemProcessor_q58 = new ItemProcessor_Q58(cyclicBarrier);
//        itemProcessor_q58.start();
        cyclicBarrier.await();
    }
}

class ItemProcessor_Q58 implements Runnable{
    CyclicBarrier cyclicBarrier;
    public ItemProcessor_Q58(CyclicBarrier cyclicBarrier){
        this.cyclicBarrier = cyclicBarrier;
    }

    public void run(){
        System.out.println("TESTING");
        try{
           cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

class Merge_Q58 implements Runnable{

    @Override
    public void run() {
        System.out.println("Value Merged");
    }
}
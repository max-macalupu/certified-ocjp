package org.oca.chapter11.cyclibarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by mx on 17/2/2017.
 */
public class CyclicBarrierTest {

    public static void main(String [] args){

        CyclicBarrier cyclicBarrier = new CyclicBarrier(4, new MixedDoubleTennisGame());
        new Player(cyclicBarrier, "Max");
        new Player(cyclicBarrier, "Leo");
        new Player(cyclicBarrier, "Junior");
        new Player(cyclicBarrier, "Ana");

    }
}

class Player extends Thread{

    CyclicBarrier countPoint;

    public Player(CyclicBarrier barrier, String name){
        this.setName(name);
        this.countPoint = barrier;
        this.start();
    }

    public void run(){
        System.out.println("Player: "+ getName() + " Has entered.");
        try {
            countPoint.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

class MixedDoubleTennisGame extends Thread{
    public void run(){
        System.out.println("All requirements has been pased.... It's Great....!");
    }
}
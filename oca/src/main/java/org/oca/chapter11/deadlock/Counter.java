package org.oca.chapter11.deadlock;

/**
 * Created by mx on 22/1/2017.
 */
public class Counter implements Runnable{

    public void incrementBallAfterRun(){
        synchronized (Runs.class){
            synchronized (Balls.class){
                Runs.runs++;
                Balls.balls++;
            }
        }
    }

    public void incrementRunAfterBall(){
        synchronized (Balls.class){
            synchronized (Runs.class){
                Balls.balls++;
                Runs.runs++;
            }
        }
    }

    @Override
    public void run() {
        incrementBallAfterRun();
        incrementRunAfterBall();
    }
}
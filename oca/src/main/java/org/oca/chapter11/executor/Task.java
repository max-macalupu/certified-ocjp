package org.oca.chapter11.executor;

import java.util.concurrent.Executor;

/**
 * Created by mx on 18/2/2017.
 */
public class Task implements Runnable{
    @Override
    public void run() {
        System.out.println("Inside of Task Thread, Thread Name: " + Thread.currentThread().getName());
    }
}

class RepeatedExecutor implements Executor{
    public void execute(Runnable command, int times) {
        for(int i=0; i<times; i++)
            execute(command);
    }

    @Override
    public void execute(Runnable command) {
        new Thread(command).start();
    }
}

class ExecutorTest{
    public static void main(String [] args){

        Runnable runnable = new Task();

        Thread simpleThread = new Thread(runnable);
        simpleThread.start();

        RepeatedExecutor repeatedExecutor = new RepeatedExecutor();
        repeatedExecutor.execute(runnable, 5);
    }
}
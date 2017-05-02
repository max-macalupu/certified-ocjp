package org.oca.mocks.enthuware.diagnostic;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * Created by mx on 1/5/2017.
 */
public class Question_03 {
    public static void main(String[] args) {
        process();
    }

    private static void process(){
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        ScheduledFuture<?> scheduledFuture = scheduledExecutorService.scheduleAtFixedRate(()-> System.out.println("10"), 10, 10, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(()-> scheduledFuture.cancel(true), 60 * 60, TimeUnit.SECONDS);
    }
}

package org.oca.mocks.whizlabs.diagnostic;

import java.util.concurrent.*;

/**
 * Created by max.macalupu on 3/17/2017.
 */
public class Question_28 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Object> myTask = new MyTask();
        ExecutorService threadPoolExecutor = Executors.newCachedThreadPool();
        System.out.println(threadPoolExecutor.submit(myTask).get().toString());
    }
}

class MyTask implements Callable<Object>{

    @Override
    public String call() throws Exception {
        return "Hello world, callable";
    }
}

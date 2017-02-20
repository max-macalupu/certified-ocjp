package org.oca.chapter11.executor;

import java.util.concurrent.*;

/**
 * Created by mx on 18/2/2017.
 */
public class Factorial implements Callable<Long> {
    private long n;
    public Factorial(long n) {
        this.n = n;
    }

    @Override
    public Long call() throws Exception {
        long factorial = 1;
        for(long value = 1; value<=n; value++){
            factorial *= value;
        }
        return factorial;
    }
}

class FactorialTest{
    public static void main(String [] args) throws ExecutionException, InterruptedException {
        Callable<Long> callableFactorial = new Factorial(20);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Long> future = executorService.submit(callableFactorial);
        System.out.print("Value of Factorial: " + future.get().toString());
        executorService.shutdown();
    }
}
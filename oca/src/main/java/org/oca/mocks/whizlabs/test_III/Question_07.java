package org.oca.mocks.whizlabs.test_III;

import java.util.concurrent.*;

/**
 * Created by mx on 9/4/2017.
 */
public class Question_07 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        process_this_method_as_runnable_and_callable();
    }

    private static void process_this_method_as_runnable_and_callable() throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Runnable runnable = () -> System.out.println("In Runnable way");
        Callable callable = () -> {System.out.println("In callable way");
                                    return null;};

//        Future<Object> runnableGet = executorService.submit(runnable);
        Future<Object> callableGet = executorService.submit(callable);

    }
}

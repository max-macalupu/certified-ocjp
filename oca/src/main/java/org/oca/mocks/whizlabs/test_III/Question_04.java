package org.oca.mocks.whizlabs.test_III;

import java.util.concurrent.*;

/**
 * Created by mx on 9/4/2017.
 */
public class Question_04 {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        process_this_method_with_threads();
    }

    private static void process_this_method_with_threads() throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService executorService = ThreadFactory_Q04.getTreadService();
        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(1000);
                return "Hello world";
            }
        });
        System.out.println(future.get(1, TimeUnit.SECONDS));
    }
}

class ThreadFactory_Q04{

    public static ExecutorService getTreadService(){
        return Executors.newFixedThreadPool(1);
    }

}

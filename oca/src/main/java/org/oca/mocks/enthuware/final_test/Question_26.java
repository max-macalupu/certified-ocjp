package org.oca.mocks.enthuware.final_test;

import java.util.concurrent.*;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_26 {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<String> future = service.submit(new Mycallable());
        System.out.println(future.get(5, TimeUnit.SECONDS));
        service.shutdown();
    }
}



class Mycallable implements Callable<String>{

    @Override
    public String call() throws Exception {
        Thread.sleep(5000);
        return "DONE";
    }
}
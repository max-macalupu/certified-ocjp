package org.oca.mocks.whizlabs.test_III;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by mx on 10/4/2017.
 */
public class Question_13 {
    public static void main(String[] args) {
        execute_stream_with_parallel_context();
    }

    private static void execute_stream_with_parallel_context(){
        AtomicInteger atomicInteger = new AtomicInteger();
        final Integer[] data = {0};
        getListOfStreamWithRandomData().parallelStream().allMatch( x-> {
           atomicInteger.incrementAndGet();
           data[0]++;
           return x.contains("e");
        });
        System.out.println(atomicInteger);
    }

    private static List<String> getListOfStreamWithRandomData(){
        return Arrays.asList(
            "he",
                "be",
                "hola",
                "but",
                "mommy"
        );
    }
}

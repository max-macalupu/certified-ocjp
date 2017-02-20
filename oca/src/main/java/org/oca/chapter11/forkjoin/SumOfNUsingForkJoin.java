package org.oca.chapter11.forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * Created by mx on 18/2/2017.
 */
public class SumOfNUsingForkJoin {

    private static long N = 1_000_000;

    private static final int NUM_THREADS = 10;

    static class RecursiveSumOfN extends RecursiveTask<Long>{

        long from, to;

        public RecursiveSumOfN(long from, long to) {
            this.from = from;
            this.to = to;
        }

        @Override
        protected Long compute() {
            if((to - from) <= N/NUM_THREADS){
                long localSum = 0;
                for(long i=from; i<=to; i++){
                    localSum += i;
                }
                System.out.printf("Sum of value range %d to %d is %d %n",from,to,localSum);
                return localSum;
            }else{
                long mid = (to+from)/2;
                System.out.printf("Forking computing into two parts %d to %d And %d to %d %n",from, mid, mid, to);

                RecursiveSumOfN recursiveSumOfN_first = new RecursiveSumOfN(from, mid);
                recursiveSumOfN_first.fork();

                RecursiveSumOfN recursiveSumOfN_second = new RecursiveSumOfN(mid + 1, to);
                long resultSecond = recursiveSumOfN_second.compute();

                return recursiveSumOfN_first.join() + resultSecond;
            }
        }
    }

    public static void main(String [] args){
        ForkJoinPool pool = new ForkJoinPool(NUM_THREADS);
        long computedSum = pool.invoke(new RecursiveSumOfN(0,N));
        long formulaSum = (N*(N+1))/2;
        System.out.printf("Sum for range 1...%d, Formula sum = %d", computedSum, formulaSum);
    }
}

package org.oca.mocks.whizlabs.test_III;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * Created by mx on 9/4/2017.
 */
public class Question_05 {
    public static void main(String[] args) {
        int[] data = {1, 4, 5 ,1 ,2, 5, 31, 3, 1, 321, 542, 41,6, 51,74, 74, 32, 7, 312, 11, 33, 66,77,21, 25, 62, 63,12, 5, 11, 63};
        process_this_method_as_thread(data);
    }

    private static void process_this_method_as_thread(int [] data){
        System.out.println(ForkJoinPool.commonPool().invoke( new TaskActionThread(data)));
    }
}

class TaskActionThread extends RecursiveTask<Integer>{

    private int[] array;
    private final int NUMBER = 2;

    public TaskActionThread(int[] array){
        this.array = array;
    }

    public int calculate(int number){
        return 2*number;
    }

    @Override
    protected Integer compute() {
        if(array.length <= NUMBER){
            int summary = 0;
            String dataStr = "";
            for(int data: array){
                summary +=data;
                dataStr += " "+ data+",";
            }
            System.out.print(Thread.currentThread().getName()+ dataStr);
            System.out.println();
            return summary;
        }else{
            int middle = array.length/2;
            TaskActionThread task1 = new TaskActionThread(Arrays.copyOfRange(array, 0, middle));
            TaskActionThread task2 = new TaskActionThread(Arrays.copyOfRange(array, middle, array.length));
            task1.fork();
            int firstResult = task1.join();
            int secondResult = task2.compute();
            return firstResult + secondResult;
        }
    }
}

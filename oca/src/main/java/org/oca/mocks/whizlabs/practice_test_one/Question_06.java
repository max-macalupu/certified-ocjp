package org.oca.mocks.whizlabs.practice_test_one;

/**
 * Created by mx on 23/3/2017.
 */
public class Question_06 {

    public static void main(String[] args) {
        Task_Q6<String, String> task = new Task_Q6<String,String>("","");
        Task_Q6<String, String> task_2 = Task_Q6.createTask("");
        Task_Q6<Long, Long> task_3 = Task_Q6.createTask(10L);
        task_2.toString();
        task_3.toString();
        Task_Q6<String, String> task1 = Task_Q6.<String>createTask("");
    }
}

class Task_Q6<T, S>{
    private T t;
    private S s;

    public Task_Q6(T t, S s) {
        this.t = t;
        this.s = s;
    }

    public static <U> Task_Q6<U,U> createTask(U u){
        return new Task_Q6<U, U>(u,u);
    }
}

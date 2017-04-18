package org.oca.mocks.whizlabs.test_IV;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by AVANTICA TECHNOLOGIES on 4/17/2017.
 */
public class Question_04 {
    private int x = 10;
    private int i = 0;
    private AtomicInteger atomicInteger = new AtomicInteger(x);
    public Question_04(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        processThisAwesomeMethod();
    }

    private static void processThisAwesomeMethod(){
        Question_04 test2_q04 = new Question_04(5);
        System.out.println(test2_q04.atomicInteger.decrementAndGet());
    }
}
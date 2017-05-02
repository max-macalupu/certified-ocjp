package org.oca.mocks.enthuware.test_I;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by mx on 1/5/2017.
 */
public class Question_12 {
    public static void main(String[] args) {
        processThis();
    }

    private static void processThis(){
        ReentrantLock reentrantLock = new ReentrantLock()    ;
        boolean f1 = reentrantLock.tryLock();
        System.out.println(f1);
        boolean f2 = reentrantLock.tryLock();
        System.out.println(f2);
    }
}

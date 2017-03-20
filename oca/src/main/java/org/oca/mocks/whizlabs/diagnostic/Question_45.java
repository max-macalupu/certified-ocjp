package org.oca.mocks.whizlabs.diagnostic;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by mx on 18/3/2017.
 */
public class Question_45 {

    public static void main(String[] args) throws InterruptedException {

        Lock loock = new ReentrantLock();

        if(loock.tryLock(1000, TimeUnit.MILLISECONDS)){
            try{
                loock.lock();
            }finally {
                loock.unlock();
            }
        }

    }
}
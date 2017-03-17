package org.oca.mocks.whizlabs.diagnostic;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by max.macalupu on 3/17/2017.
 */
public class Question_43 {

    public static void main(String[] args) {

        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>(Arrays.asList("a","b"));


        new Thread(){
            public void run(){
                Iterator iterator = copyOnWriteArrayList.iterator();
                iterator.next();
                copyOnWriteArrayList.remove(0);
            }
        }.start();

        new Thread(){
            public void run(){
                copyOnWriteArrayList.add("c");
                System.out.println(copyOnWriteArrayList);
            }
        }.start();

        System.out.println(copyOnWriteArrayList);

    }

}

package org.oca.mocks.enthuware.trial;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by max.macalupu on 3/8/2017.
 */
public class Question_08 {
    public static void main(String[] args) {
        final Student student = new Student();
        new Thread(){
            int x  = 0;
            public void run(){
                while(true){
                    int random = (int) (Math.random()*3000);
                    student.setMarksInSubject("key_"+x, random);
                    x++;
                }
            }
        }.start();

        for(int i=0; i<5; i++){
            new Thread(){
                public void run(){
                    while(true){
                        double average = student.getAverageMarket();
                        System.out.println("The average result is: " + average);
                    }
                }
            }.start();
        }
    }
}

class Student{

    private Map<String, Integer> mapWithData = new HashMap<String, Integer>();
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public void setMarksInSubject(String key, Integer value){

        readWriteLock.writeLock().lock();
        try{
//            if(mapWithData.get(key)==null){
//                mapWithData.put(key,0);
//            }
//            mapWithData.put(key, mapWithData.get(key) + value);
            mapWithData.put(key, value);
        }finally {
            readWriteLock.writeLock().unlock();
        }
    }

    public double getAverageMarket(){
        readWriteLock.readLock().lock();
        try{
            double sum = 0.0;
            for(Integer value: this.mapWithData.values()){
                Thread.sleep(1000);
                sum += value;
            }
            return sum/this.mapWithData.size();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            readWriteLock.readLock().unlock();
        }
        return 0;
    }
}
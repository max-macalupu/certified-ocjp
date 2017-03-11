package org.oca.mocks.whizlabs.trial;

import java.io.IOException;

/**
 * Created by max.macalupu on 3/10/2017.
 */
public class Question_02 {

    public static void main(String[] args) {
        try(MyResource myResource = new MyResource();){
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("Exception...");
            for(Throwable throwable: e.getSuppressed()){
                System.out.println(throwable.toString());
            }
        }
    }
}

class MyResource implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("In Clooosing...");
        throw new IOException();
    }
}
package org.oca.mocks.whizlabs.test_II;

import java.io.IOException;

/**
 * Created by mx on 24/4/2017.
 */
public class Question_52 {
    public static void main(String[] args) {
        processThisAwesomeMethod();
    }

    private static void processThisAwesomeMethod(){
        try(MyResource_Q52 myResource_q52 = new MyResource_Q52())    {
            throw new SecurityException();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

class MyResource_Q52 implements AutoCloseable{

    @Override
    public void close() throws Exception {
        throw new IOException();
    }
}

package org.oca.mocks.enthuware.test_IV;

import java.io.IOException;

/**
 * Created by mx on 8/5/2017.
 */
public class Question_49 {
    public static void main(String[] args) throws Exception{
        try(FileReader fileReader = new FileReader()){
            process();
        }catch (Exception e){
            System.out.println(e.toString());
            for(Throwable throwable: e.getSuppressed()){
                System.out.println(throwable.toString());
            }
        }
    }

    private static void process() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }
}

class FileReader implements AutoCloseable{

    @Override
    public void close() throws Exception {
        throw new IOException();
    }
}

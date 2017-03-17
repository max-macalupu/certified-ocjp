package org.oca.mocks.whizlabs.trial;

import java.io.IOException;

/**
 * Created by mx on 11/3/2017.
 */
public class Question_14 implements AutoCloseable{

    public static void main(String[] args) {
        try(Question_14 question_14 = new Question_14();){
            question_14.open();
            question_14.read();
            question_14.close();
            question_14.open();
        }catch (Exception ex){
            System.out.println("in catch....");
        }
    }

    public void open(){
        System.out.println("Opening class...");
    }

    public void read() throws IOException {
        System.out.println("Reading class...");
        throw new IOException();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing the class");
    }
}

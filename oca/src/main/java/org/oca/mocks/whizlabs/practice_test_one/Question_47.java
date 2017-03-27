package org.oca.mocks.whizlabs.practice_test_one;

import java.io.IOException;

/**
 * Created by mx on 26/3/2017.
 */
public class Question_47 implements AutoCloseable{
    public static void main(String[] args) {
        try(Question_47 question_47 = new Question_47()){
            question_47.open();
            question_47.read();
            question_47.close();
        } catch (Exception e) {
            System.out.println("Exception cautched in trhow");
            e.printStackTrace();
        }
    }

    public void open(){
        System.out.println("Is open");
    }

    public void read() throws IOException {
        throw new IOException();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing");
    }
}
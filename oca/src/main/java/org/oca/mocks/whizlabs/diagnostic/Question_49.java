package org.oca.mocks.whizlabs.diagnostic;

import java.io.*;

/**
 * Created by mx on 18/3/2017.
 */
public class Question_49 {

    public static void main(String[] args) throws IOException {

        try(FileReader fileReader = new FileReader("log.txt");
            FileReader fileReader2 = new FileReader("log.txt");
            FileWriter fileWriter = new FileWriter("log.txt")) {
//            throw new IOException();
            System.out.println("In try");
            throw new Exception();
        }catch(Exception ex){
            System.out.println(ex.toString());
        }finally {
            System.out.println("Hello world");
        }

    }
}

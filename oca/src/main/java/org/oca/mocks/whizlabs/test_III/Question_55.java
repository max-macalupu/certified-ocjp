package org.oca.mocks.whizlabs.test_III;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by mx on 13/4/2017.
 */
public class Question_55 {
    public static void main(String[] args) throws IOException {
        processThisAwesomeMethodForTest();
    }

    private static void processThisAwesomeMethodForTest() throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("pom.xml"))){
            String line = null;
            while((line = bufferedReader.readLine())!=null){
                System.out.println(line);
            }


            BufferedReader bufferedReader2 = new BufferedReader(new FileReader("txt2.txt"));
            String line2 = null;
            while((line2 = bufferedReader.readLine())!=null){
                System.out.println(line2);
            }
        }
    }
}

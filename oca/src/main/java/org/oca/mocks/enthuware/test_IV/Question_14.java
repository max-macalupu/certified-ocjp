package org.oca.mocks.enthuware.test_IV;

import java.io.*;

/**
 * Created by mx on 8/5/2017.
 */
public class Question_14 {
    public static void main(String[] args) {

    }

    private static void copy(String record1, String record2) throws IOException {
        try(InputStream inputStream = new FileInputStream(record1);
            OutputStream outputStream = new FileOutputStream(record2)){
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while((bytesRead = (inputStream.read(buffer))) != -1){
                outputStream.write(buffer, 0, bytesRead);
                System.out.println("File to Read" + bytesRead);
            }
        }catch(IOException | IndexOutOfBoundsException e){
//                e = new RuntimeException();
                e.printStackTrace();
        }
    }
}
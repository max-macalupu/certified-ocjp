package org.oca.mocks.enthuware.test_IV;

import java.io.*;

/**
 * Created by mx on 8/5/2017.
 */
public class Question_48 {
    public static void main(String[] args) {

    }

    private static void copy(String record1, String record2) throws IOException {
        try(InputStream inputStream = new FileInputStream(record1);
            OutputStream outputStream = new FileOutputStream(record2)){
//            if(outputStream==null) outputStream = new FileOutputStream("c:\\data\\personal");
        }
    }
}

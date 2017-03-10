package org.oca.chapter09.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * Created by max.macalupu on 3/1/2017.
 */
public class Question_01 {

    public static void main(String[] args) throws FileNotFoundException {
        OutputStream outputStream = new FileOutputStream("log.txt");
        System.setErr(new PrintStream(outputStream));
        System.err.print("ERROR");
    }
}

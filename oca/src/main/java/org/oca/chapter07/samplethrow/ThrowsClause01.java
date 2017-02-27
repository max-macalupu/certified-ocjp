package org.oca.chapter07.samplethrow;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by max.macalupu on 2/27/2017.
 */
public class ThrowsClause01 {
    public static void main(String [] args) throws FileNotFoundException{
        System.out.println("Reading a integer for the file 'integer.txt'");
        Scanner consoleScanner = new Scanner(new File("integer.txt"));
        System.out.println("File has been read from the code");
    }
}
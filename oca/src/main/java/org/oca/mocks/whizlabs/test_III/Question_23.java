package org.oca.mocks.whizlabs.test_III;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by mx on 14/4/2017.
 */
public class Question_23 {
    public static void main(String[] args) throws IOException {
        processThisMethodWithAsleep();
    }


    private static void processThisMethodWithAsleep() throws IOException {
        Path path = Paths.get("jquery.js");
        try(BufferedWriter bufferedReader = Files.newBufferedWriter(path, StandardOpenOption.SYNC);){
            bufferedReader.write("xxxxxxxxxxxxxxx");
        }
        System.out.println("print");
    }
}

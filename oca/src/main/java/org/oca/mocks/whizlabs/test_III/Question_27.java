package org.oca.mocks.whizlabs.test_III;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by mx on 14/4/2017.
 */
public class Question_27 {
    public static void main(String[] args) throws IOException {
        processThisBooredMethod();
    }


    private static void processThisBooredMethod() throws IOException {
        try(Stream<String> stream = Files.lines(Paths.get("."));
                BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get("fileTxt.txt"))){

//            stream.forEach(bufferedWriter::write);
        }
    }
}

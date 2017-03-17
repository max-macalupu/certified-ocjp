package org.oca.mocks.whizlabs.diagnostic;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by max.macalupu on 3/17/2017.
 */
public class Question_21 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get("log.txt"), new OpenOption[] {
                StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.CREATE
//                StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.CREATE_NEW
        });
        bufferedWriter.write("Hey how are you");
        bufferedWriter.close();
    }
}
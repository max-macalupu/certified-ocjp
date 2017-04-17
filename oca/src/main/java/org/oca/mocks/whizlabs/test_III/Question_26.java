package org.oca.mocks.whizlabs.test_III;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by mx on 14/4/2017.
 */
public class Question_26 {
    public static void main(String[] args) throws IOException {
        processThisMethod();
    }

    private static void processThisMethod() throws IOException {
//        String regex = "glob:*.txt";
        String regex = "*.*";
        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get("."), regex)){
            directoryStream.forEach(System.out::println);
        }
    }
}

package org.oca.mocks.whizlabs.practice_test_one;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created by mx on 25/3/2017.
 */
public class Question_13 {
    public static void main(String[] args) throws IOException {

        Path path1 = Paths.get("jquery.js");
        Files.move(path1, Paths.get("filename.zip"), StandardCopyOption.ATOMIC_MOVE);

    }
}
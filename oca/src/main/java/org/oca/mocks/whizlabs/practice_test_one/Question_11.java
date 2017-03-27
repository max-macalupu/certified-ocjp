package org.oca.mocks.whizlabs.practice_test_one;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;

/**
 * Created by mx on 25/3/2017.
 */
public class Question_11 {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("log.txt");
        Files.setAttribute(path, "lastModifiedTime", FileTime.fromMillis(System.currentTimeMillis()));
    }
}
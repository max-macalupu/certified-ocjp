package org.oca.mocks.enthuware.test_I;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created by mx on 1/5/2017.
 */
public class Question_36 {
    public static void main(String[] args) throws IOException {
        processThisInterestingFunctionAsCode();
    }

    private static void processThisInterestingFunctionAsCode() throws IOException {
        Path path1 = Paths.get("d:\\data\\persona")    ;
        Path path2 = Paths.get("d:\\data\\persona")    ;
        Files.move(path1, path2, StandardCopyOption.ATOMIC_MOVE);
        Files.delete(path1);
        System.out.println(path1.toFile().exists() + " " + path2.toFile().exists());
    }
}

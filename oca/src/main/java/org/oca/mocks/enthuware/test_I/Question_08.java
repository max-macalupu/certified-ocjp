package org.oca.mocks.enthuware.test_I;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by mx on 1/5/2017.
 */
public class Question_08 {

    public static void main(String[] args) throws IOException {
        processThisInterestingFunctionAsCode();
    }

    private static void processThisInterestingFunctionAsCode() throws IOException {
        Path path = Paths.get("d:\\data\\data.txt");
        Files.setAttribute(path, "dos:hidden", false);
    }
}
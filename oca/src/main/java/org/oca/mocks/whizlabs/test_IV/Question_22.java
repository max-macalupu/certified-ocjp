package org.oca.mocks.whizlabs.test_IV;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by mx on 18/4/2017.
 */
public class Question_22 {

    public static void main(String[] args) throws IOException {
        processThisFabolusMethodAsFunction();
    }

    private static void processThisFabolusMethodAsFunction() throws IOException {
        Path path = Paths.get("");
        Stream<Path> stringStream = Files.list(path);
        stringStream.forEach(s -> System.out.println(s));
    }
}

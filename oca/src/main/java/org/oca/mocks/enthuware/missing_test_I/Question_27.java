package org.oca.mocks.enthuware.missing_test_I;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.function.Predicate;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_27 {
    public static void main(String[] args) throws IOException {
        Path pa1 = Paths.get("d:\\data\\atati\\aa.java");
        Path pa2 = Paths.get("d:\\data\\atati\\Newfolder(4)\\aa.java");

        Files.move(pa1, pa2, StandardCopyOption.ATOMIC_MOVE);
        Files.delete(pa1);

//        Predicate predicate = (Integer i) -> i%2==0;
    }
}

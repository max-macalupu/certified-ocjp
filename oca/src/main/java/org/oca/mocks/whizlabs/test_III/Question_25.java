package org.oca.mocks.whizlabs.test_III;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by mx on 10/4/2017.
 */
public class Question_25 {
    public static void main(String[] args) throws IOException {
        process_this_insane_method();
    }

    private static void process_this_insane_method() throws IOException {
        Files.find(Paths.get("."), Integer.MAX_VALUE, (p,a) -> p.endsWith(".txt")).map(p-> p.toAbsolutePath()).forEach(System.out::println);
    }
}

package org.oca.mocks.whizlabs.test_II;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by mx on 8/4/2017.
 */
public class Question_24 {
    public static void main(String[] args) {
        Path path = Paths.get("c:/Oracle/Middleware/logs/log.txt");
        System.out.println(path.getName(3));
    }
}
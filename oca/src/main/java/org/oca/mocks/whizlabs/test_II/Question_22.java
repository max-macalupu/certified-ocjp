package org.oca.mocks.whizlabs.test_II;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by mx on 8/4/2017.
 */
public class Question_22 {
    public static void main(String[] args) {
        Path path1 = Paths.get("Oracle");
//        Path path1 = Paths.get("c:/Oracle");
        Path path2 = Paths.get("log.txt");
        System.out.println(path1.relativize(path2));
        System.out.println("End of the method...!");
    }
}

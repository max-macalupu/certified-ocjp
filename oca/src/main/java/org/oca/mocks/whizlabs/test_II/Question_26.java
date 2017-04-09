package org.oca.mocks.whizlabs.test_II;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by mx on 8/4/2017.
 */
public class Question_26 {
    public static void main(String[] args) {
        Path path1 = Paths.get("c:/testmx/data");
        Path path2 = path1.resolve("fileTest.txt");
        path1.resolve(path2);
        path2.resolve(path1);
        System.out.println(path1);
        System.out.println(path2);
    }
}

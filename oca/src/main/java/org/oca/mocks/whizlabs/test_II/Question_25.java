package org.oca.mocks.whizlabs.test_II;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by mx on 8/4/2017.
 */
public class Question_25 {
    public static void main(String[] args) {
        Path path1 = Paths.get("./../bash.exe.stackdump");
        Path path2 = Paths.get("filename.zip");
        Path path3 = path1.relativize(path2);
        System.out.println(path3);
    }
}

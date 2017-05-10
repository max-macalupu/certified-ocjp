package org.oca.mocks.enthuware.final_test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_21 {
    public static void main(String[] args) {
        Path path = Paths.get("c:\\temp\\test.txt");
        Path path2 = Paths.get("test2.txt");
        Path path3 = path.resolve(path2);
        Path path4 = path.relativize(path2);
        System.out.println(path3);
    }
}

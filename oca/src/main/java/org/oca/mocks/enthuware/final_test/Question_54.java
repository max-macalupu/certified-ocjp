package org.oca.mocks.enthuware.final_test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_54 {
    public static void main(String[] args) {
        Path path = Paths.get("c:\\..\\temp\\test.txt");
        System.out.println(path.normalize());
        System.out.println(path.toAbsolutePath());
        System.out.println(path.normalize().toUri());
    }
}

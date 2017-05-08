package org.oca.mocks.enthuware.test_III;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by mx on 6/5/2017.
 */
public class Question_50 {
    public static void main(String[] args) {
        Path p1 = Paths.get("d:\\data\\persona\\.\\install\\..\\data.txt");
        Path p2 = Paths.get("d:\\data\\data.txt");
        Path p3 = p1.relativize(p2);
        System.out.println(p3);
    }
}

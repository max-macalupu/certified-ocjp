package org.oca.mocks.enthuware.test_IV;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by mx on 8/5/2017.
 */
public class Question_40 {
    public static void main(String[] args) {
        Path path1 = Paths.get("d:\\data\\personal\\install\\a.txt");
        System.out.println(path1.getName(3).toString());
    }
}

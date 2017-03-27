package org.oca.mocks.whizlabs.practice_test_one;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by mx on 25/3/2017.
 */
public class Question_10 {

    public static void main(String[] args) {
        Path path = Paths.get("//parent-dir//main-dir//child-dir");
        System.out.println(path.getName(2));
    }
}
package org.oca.mocks.enthuware.test_II;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by mx on 2/5/2017.
 */
public class Question_06 {

    public static void main(String[] args) {
        processThis();
    }

    private static void processThis(){
        Path path1 = Paths.get("data\\test");
        Path path2 = Paths.get("testOther");
        System.out.println(path1.resolve(path2) + " " + path1.relativize(path2));
    }
}

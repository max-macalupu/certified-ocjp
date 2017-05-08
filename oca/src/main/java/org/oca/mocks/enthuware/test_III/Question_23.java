package org.oca.mocks.enthuware.test_III;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by mx on 6/5/2017.
 */
public class Question_23 {

    static Path path =Paths.get("d:\\data");

    public static void main(String[] args) {
        process();
    }

    private static void process(){
        String root = path.getRoot().toString();
        System.out.println(root);
    }
}

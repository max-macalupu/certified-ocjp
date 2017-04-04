package org.oca.mocks.whizlabs.test_II;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by mx on 4/4/2017.
 */
public class Question_16 {
    public static void main(String[] args) {
        Path path = Paths.get("/users/mine/data/with/hadoop.java");
        System.out.println(path.startsWith("user") + " " + path.endsWith("hadoop"));
    }
}

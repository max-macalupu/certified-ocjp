package org.oca.mocks.whizlabs.test_II;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by mx on 4/4/2017.
 */
public class Question_20 {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/java/org");
        System.out.println(path.getName(3));
    }
}

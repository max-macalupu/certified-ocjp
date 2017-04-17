package org.oca.mocks.whizlabs.test_III;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by mx on 14/4/2017.
 */
public class Question_19 {
    public static void main(String[] args) {
        processThisMethod();
    }

    private static void processThisMethod(){
        Path path = Paths.get("./test/data/..");
        System.out.println(path.normalize());
    }
}

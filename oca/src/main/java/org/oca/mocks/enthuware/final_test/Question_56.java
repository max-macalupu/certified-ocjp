package org.oca.mocks.enthuware.final_test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_56 {

    static Path mainPath = Paths.get("d:\\data\\atati\\aa.java");

    public static void main(String[] args) {

        System.out.println(mainPath.subpath(0,2));

    }
}

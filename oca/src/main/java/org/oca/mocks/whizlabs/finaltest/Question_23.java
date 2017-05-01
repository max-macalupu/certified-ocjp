package org.oca.mocks.whizlabs.finaltest;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by mx on 29/4/2017.
 */
public class Question_23 {

    public static void main(String[] args) {
        processThisFunction();
    }

    private static void processThisFunction(){
        Path path = Paths.get("D:\\data\\personal\\install");
        Path path2 = Paths.get("C:\\hadoop");
        Path path1 = Paths.get(path2.getRoot().toString(), path.subpath(0,3).toString());
        System.out.println(path1.toString());
    }
}

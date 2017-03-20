package org.oca.mocks.whizlabs.diagnostic;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by mx on 18/3/2017.
 */
public class Question_44 {

    public static void main(String[] args) {
        String stringPath = "src"+ File.separator +" Question_44" + File.separator + "java" + File.separator + "package";
        Path path = Paths.get(stringPath);
        System.out.println(stringPath);
        System.out.println(path.getRoot() + " \n" +path.getParent() + " \n" + path.getName(3) + " \n" + path.getName(2) + " \n" + path.getName(1) + "\n" + path.getName(0));
    }
}
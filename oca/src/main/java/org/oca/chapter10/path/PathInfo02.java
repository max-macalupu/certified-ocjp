package org.oca.chapter10.path;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by max.macalupu on 3/1/2017.
 */
public class PathInfo02 {

    public static void main(String[] args) throws IOException {

        Path testFilePath = Paths.get(".\\Test");
        System.out.println("The file name is: " + testFilePath.getFileName());
        System.out.println("The file directory is: " + testFilePath.toAbsolutePath());
        System.out.println("The file parent is: " + testFilePath.getParent());
        System.out.println("The file URI is: " + testFilePath.toUri());
        System.out.println("The file root is: " + testFilePath.getRoot());

        String normalizedPath = testFilePath.normalize().toString();
        System.out.println("The to absolute path as string is: " + normalizedPath );
        Path testPathNormalized = Paths.get(normalizedPath);
        System.out.println("The to absolute path is: " + testPathNormalized.toAbsolutePath());
        System.out.println("Its normalized real path is: " + testPathNormalized.toRealPath(LinkOption.NOFOLLOW_LINKS));

    }
}
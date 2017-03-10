package org.oca.chapter10.compare;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by max.macalupu on 3/7/2017.
 */
public class PathCompare02 {

    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("filename.zip");
        Path path2 = Paths.get("C:\\Users\\max.macalupu\\Documents\\ws\\local\\oca\\book\\data\\code\\oca\\filename.zip");
        System.out.println("Files.isSameFile(path1,path2) is: " + Files.isSameFile(path1, path2));
    }

}

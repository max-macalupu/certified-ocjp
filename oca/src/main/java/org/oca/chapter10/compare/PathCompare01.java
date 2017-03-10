package org.oca.chapter10.compare;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by max.macalupu on 3/2/2017.
 */
public class PathCompare01 {
    public static void main(String[] args) {

        Path path1 = Paths.get("filename.zip");
        Path path2 = Paths.get("C:\\Users\\max.macalupu\\Documents\\ws\\local\\oca\\book\\data\\code\\oca\\filename.zip");

        System.out.println("(Path1.compareTo(path2)==0) is: " + (path1.compareTo(path2)==0));
        System.out.println("(Path1.equals(path2)==0) is: " + path1.equals(path2));
        System.out.println("(Path1.equals(path2.toAbsolutePath())==0) is: " + path1.toAbsolutePath().equals(path2));

    }
}
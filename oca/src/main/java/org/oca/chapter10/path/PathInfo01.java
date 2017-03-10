package org.oca.chapter10.path;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by max.macalupu on 3/1/2017.
 */
public class PathInfo01 {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\test\\test.txt");
        System.out.println("The file name is: " + path.getFileName());
        System.out.println("The file directory is: " + path.toAbsolutePath());
        System.out.println("The file parent is: " + path.getParent());
        System.out.println("The file root is: " + path.getRoot());

        for(Path _path: path){
            System.out.println("Path element: " + _path);
        }
    }
}
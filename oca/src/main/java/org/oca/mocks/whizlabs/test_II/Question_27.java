package org.oca.mocks.whizlabs.test_II;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

/**
 * Created by mx on 8/4/2017.
 */
public class Question_27 {
    public static void main(String[] args) {
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:?.[!j]*");
        Path path1 = Paths.get("config.xml");
        Path path2 = Paths.get("jquery.js");
        Path path3 = Paths.get("index.html");
        Path path4 = Paths.get("photo.jpeg");
        Path path5 = Paths.get("p.jpeg");
        Path path6 = Paths.get("o.gg");
        System.out.println(pathMatcher.matches(path1));
        System.out.println(pathMatcher.matches(path2));
        System.out.println(pathMatcher.matches(path3));
        System.out.println(pathMatcher.matches(path4));
        System.out.println(pathMatcher.matches(path5));
        System.out.println(pathMatcher.matches(path6));
    }
}
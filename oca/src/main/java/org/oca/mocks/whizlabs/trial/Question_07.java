package org.oca.mocks.whizlabs.trial;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.PathMatcher;

/**
 * Created by mx on 11/3/2017.
 */
public class Question_07 {

    public static void main(String[] args) {
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:**.{xml,json}");
//        PathMatcher pathMatcher_2 = FileSystems.getDefault().getPathMatcher("regex:**.{xml,json}");
        System.out.println(pathMatcher.toString());
//        System.out.println(pathMatcher_2.toString());
    }
}
package org.oca.mocks.enthuware.test_III;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by mx on 6/5/2017.
 */
public class Question_39 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("d:\\data\\atati");
        Files.walkFileTree(path, new MyFileChecker_Q39());
        System.out.println(MyFileChecker_Q39.count);
    }
}

class MyFileChecker_Q39 extends SimpleFileVisitor<Path>{

    private final PathMatcher pathMatcher ;
    static int count = 0;

    public MyFileChecker_Q39() {
        this.pathMatcher = FileSystems.getDefault().getPathMatcher("glob:*.java");
    }

    public FileVisitResult visitFile(Path p, BasicFileAttributes attr){
        if(p.getFileName()!=null && pathMatcher.matches(p.getFileName())){
            count++;
        }
        return FileVisitResult.CONTINUE;
    }
}
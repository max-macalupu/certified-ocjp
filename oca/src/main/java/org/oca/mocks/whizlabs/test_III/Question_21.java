package org.oca.mocks.whizlabs.test_III;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by mx on 14/4/2017.
 */
public class Question_21 {
    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("."), new MyFileVisitor_Q21());
    }
}

class MyFileVisitor_Q21 extends SimpleFileVisitor<Path> {

    private PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("*.{java,class}");

    public FileVisitResult visitFile(Path file, BasicFileAttributes basicFileAttributes){
        if(pathMatcher.matches(file)){
            System.out.println(file.toString());
        }
        return FileVisitResult.CONTINUE;
    }
}

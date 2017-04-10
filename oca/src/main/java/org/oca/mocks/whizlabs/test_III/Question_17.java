package org.oca.mocks.whizlabs.test_III;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by mx on 10/4/2017.
 */
public class Question_17 {
    public static void main(String[] args) throws IOException {
        process_this_method();
    }

    private static void process_this_method() throws IOException {
        Files.walkFileTree(Paths.get("."), new FileVisitor_Q17());
    }
}

class FileVisitor_Q17 implements FileVisitor<Path>{
    private PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("ab?");
    int count = 0;
//    private PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:**");

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        if(pathMatcher.matches(dir)){
            return FileVisitResult.CONTINUE;
        }else{
            return FileVisitResult.SKIP_SUBTREE;
        }
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        count++;
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }
}

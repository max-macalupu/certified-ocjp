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
        FileVisitor_Q17 fileVisitor_q17 = new FileVisitor_Q17();
        Files.walkFileTree(Paths.get(".").toAbsolutePath(), fileVisitor_q17);
        System.out.println(fileVisitor_q17.count);
        System.out.println(fileVisitor_q17.countMatcher);
    }
}

class FileVisitor_Q17 implements FileVisitor<Path>{
//    private PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:ab*");
//    private PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("ab?");
    int count = 0;
    int countMatcher = 0;
    private PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:**ab\\\\**");

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println(dir.toAbsolutePath());
//        System.out.println(dir.getParent());
        if(pathMatcher.matches(dir)){
            countMatcher ++ ;
            return FileVisitResult.CONTINUE;
        }else{
//            return FileVisitResult.SKIP_SUBTREE;
            return FileVisitResult.CONTINUE;
        }
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {count++;
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
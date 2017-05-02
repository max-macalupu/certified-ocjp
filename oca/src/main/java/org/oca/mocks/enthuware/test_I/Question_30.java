package org.oca.mocks.enthuware.test_I;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by mx on 1/5/2017.
 */
public class Question_30 {
    public static void main(String[] args) throws IOException {
        processThisWalkerFunction();
    }

    private static void processThisWalkerFunction() throws IOException {
        MyFileChecker_Q30 myFileCheckerQ30 = new MyFileChecker_Q30();
//        Files.walkFileTree(Paths.get("D:\\data"), myFileCheckerQ30);
        Files.walkFileTree(Paths.get("."), myFileCheckerQ30);
        System.out.println(myFileCheckerQ30.counter);
    }
}
class MyFileChecker_Q30 implements FileVisitor<Path>{

    PathMatcher pathMatcher;

    public MyFileChecker_Q30() {
        pathMatcher = FileSystems.getDefault().getPathMatcher("glob:**.java");
    }
    int counter=0;

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if(pathMatcher.matches(file)){
            counter++;
        }
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
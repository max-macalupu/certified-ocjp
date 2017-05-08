package org.oca.mocks.enthuware.test_III;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by mx on 4/5/2017.
 */
public class Question_03 {
    public static void main(String[] args) throws IOException {
        processTHisInterestingFunctionIncode();
    }

    private static void processTHisInterestingFunctionIncode() throws IOException {
        MyFileVisitor_Q03 myFileVisitor_q03 = new MyFileVisitor_Q03();
        Files.walkFileTree(Paths.get("d:\\\\data"), myFileVisitor_q03);
    }
}

class MyFileVisitor_Q03 implements FileVisitor<Path>{

    private final PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:*{*/*t*, **/**}");

    MyFileVisitor_Q03() {
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
//        System.out.println(dir);
        if(pathMatcher.matches(dir)){
            System.out.println("*******" + dir);
            return FileVisitResult.CONTINUE;
        }
        return FileVisitResult.SKIP_SIBLINGS;
//        return FileVisitResult.CONTINUE;
//        return FileVisitResult.SKIP_SUBTREE;
//        return FileVisitResult.TERMINATE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println(file);
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
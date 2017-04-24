package org.oca.mocks.whizlabs.test_II;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by mx on 3/4/2017.
 */
public class Question_14 {

    public static void main(String[] args) throws IOException {
        MyFileVisitor_Q14 myFileVisitorQ14 = new MyFileVisitor_Q14();
        Path path = Paths.get(".");
        System.out.println(path.toAbsolutePath());
        Files.walkFileTree(path, myFileVisitorQ14);
        System.out.println(myFileVisitorQ14.count);
        System.out.println(myFileVisitorQ14.countFile);
    }

}

class MyFileVisitor_Q14 implements FileVisitor<Path>{

    private PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:**/src*");
//    private PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:**{java,*ml}");
    int count = 0 ;
    int countFile = 0;

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        countFile ++ ;
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        if(pathMatcher.matches(dir)){
            System.out.println(dir.toAbsolutePath());
            return FileVisitResult.CONTINUE.CONTINUE;
        }else{
            return FileVisitResult.SKIP_SUBTREE;
        }
    }
}
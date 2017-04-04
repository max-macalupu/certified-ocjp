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
        Files.walkFileTree(Paths.get("c:/Users/mx/ws/github/oca/code/oca/oca/oca/"), myFileVisitorQ14);
        System.out.println(myFileVisitorQ14.count);
    }

}

class MyFileVisitor_Q14 implements FileVisitor<Path>{

    private PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:**/src*");
//    private PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:**{java,*ml}");
    int count = 0 ;

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if(pathMatcher.matches(file)){
            return FileVisitResult.CONTINUE.CONTINUE;
        }else{
            return FileVisitResult.SKIP_SUBTREE;
        }
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        count++;
        return FileVisitResult.CONTINUE;
    }
}
package org.oca.mocks.whizlabs.test_IV;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by AVANTICA TECHNOLOGIES on 4/27/2017.
 */
public class Question_19 {

    public static void main(String[] args) throws IOException {
        FileVisitor fileVisitor = new FileVisitorFor_Q19();
        Files.walkFileTree(Paths.get("d:\\data"), fileVisitor);
//        Files.walkFileTree(Paths.get("."), fileVisitor);
//        System.out.println(fileVisitor.);
    }

    private static final class FileVisitorFor_Q19 extends SimpleFileVisitor<Path>{
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:*.java");

        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException{
            System.out.println(file);
            if(pathMatcher.matches(file)){
//            if(pathMatcher.matches(file.getFileName())){
                System.out.println(file.toAbsolutePath());
            }
            return FileVisitResult.CONTINUE;
        }
    }
}
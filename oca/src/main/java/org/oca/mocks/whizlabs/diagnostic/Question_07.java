package org.oca.mocks.whizlabs.diagnostic;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by mx on 17/3/2017.
 */
public class Question_07 {
    public static void main(String[] args) throws IOException {
        MyFiles myFiles = new MyFiles();
        Path path = Paths.get("src");
        System.out.println(path.toAbsolutePath());
        Files.walkFileTree(path,myFiles);
    }
}

class MyFiles extends SimpleFileVisitor<Path>{

    private final PathMatcher pathMatcher;

    MyFiles() {
        this.pathMatcher = FileSystems.getDefault().getPathMatcher("glob:**");
    }

    void  printPath(Path path){
        if(path!=null && pathMatcher.matches(path)){
            System.out.println(path);
        }
    }

    public FileVisitResult visitFile(Path path, BasicFileAttributes attributes){
        printPath(path);
//        return FileVisitResult.CONTINUE;
//        return FileVisitResult.SKIP_SUBTREE;
//        return FileVisitResult.SKIP_SIBLINGS;
        return FileVisitResult.TERMINATE;
    }
}

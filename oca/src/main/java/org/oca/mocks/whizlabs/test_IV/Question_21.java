package org.oca.mocks.whizlabs.test_IV;

import java.io.IOException;
import java.nio.file.*;

/**
 * Created by mx on 18/4/2017.
 */
public class Question_21 {

    static boolean t;

    public static void main(String[] args) throws IOException {
        processThisFuckMethodAsFunction();
    }

    private static void processThisFuckMethodAsFunction() throws IOException {

        FileVisitor<Path> fileVisitor = new Mat_Q21();
        Files.walkFileTree(Paths.get("D:\\"), fileVisitor);
        if(!t) System.out.println("NoMatches");

    }

    private static final class Mat_Q21 extends SimpleFileVisitor<Path>{

        public FileVisitResult postVisitDirectory(Path path, IOException ioException) throws IOException{
            PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("regex:.");
            if(pathMatcher.matches(path.getFileName())){
                System.out.println(path);
                t = true;
            }
            return FileVisitResult.CONTINUE;
        }
    }
}
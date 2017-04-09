package org.oca.mocks.whizlabs.test_II;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

/**
 * Created by AVANTICA TECHNOLOGIES on 4/3/2017.
 */
public class Question_13 {
    public static void main(String[] args) throws IOException {
        FileSystem fileSystem = FileSystems.getDefault();
        PathMatcher pathMatcher = fileSystem.getPathMatcher("glob:**{java,*ml}");
//        PathMatcher pathMatcher = fileSystem.getPathMatcher("glob:*.*");
//        PathMatcher pathMatcher = fileSystem.getPathMatcher("glob:**.[java,html,xml]");
//        PathMatcher pathMatcher = fileSystem.getPathMatcher("glob:*.{java,html,xml}");
        Path path = Paths.get("_java/MyClass.java");
//        System.out.println(path!=null?pathMatcher.matches(path):"Empty");
        listAndShowAllTreeDirectory("C:/Users/max.macalupu/Documents/ws/local/oca", pathMatcher);
    }

    private static void listAndShowAllTreeDirectory(String directoryPath, PathMatcher pathMatcher) throws IOException {
        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(directoryPath))){
            for(Path path: directoryStream){
//                System.out.println("Is File:" + path.isAbsolute() + ". ToString:" + path.toAbsolutePath());
                if(Files.isDirectory(path)){
                    listAndShowAllTreeDirectory(path.toAbsolutePath().toString(), pathMatcher);
                }else{
                    if(pathMatcher.matches(path)){
                        System.out.println("It matches, " + path.toAbsolutePath());
                    }
                }
            }
        }
    }
}

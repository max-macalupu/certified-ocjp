package org.oca.mocks.enthuware.missing_test_II;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_08 {
    public static void main(String[] args) {
        File[] files = File.listRoots();
        for(File file: files){
            System.out.println(file);
        }

        Iterable<Path> pathStream = FileSystems.getDefault().getRootDirectories();
        for(Path path: pathStream){
            System.out.println(path);
        }

    }
}

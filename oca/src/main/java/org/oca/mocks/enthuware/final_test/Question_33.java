package org.oca.mocks.enthuware.final_test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_33 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("d:\\data\\atati\\aa.java");
        Path path2 = Paths.get("d:\\data\\atati\\cc.java");
        copy(path, path2);
        if(Files.isSameFile(path, path2)){
            System.out.println("file copied");
        }else{
            System.out.println("file not copied");
        }
    }

    private static void copy(Path pat1, Path path2) throws IOException {
        Files.copy(pat1, path2, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
    }
}
package org.oca.mocks.enthuware.final_test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_29 {
    public static void main(String[] args) {
        try{
            Stream<Path> stream = Files.find(Paths.get("d:\\data\\atati"),
                                                Integer.MAX_VALUE,
                                                (p,a) -> p.endsWith("aa.java") && a.isRegularFile());
            stream.forEach(x -> System.out.println(x.toAbsolutePath()));
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
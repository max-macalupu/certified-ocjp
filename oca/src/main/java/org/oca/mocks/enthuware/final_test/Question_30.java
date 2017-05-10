package org.oca.mocks.enthuware.final_test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_30 {
    public static void main(String[] args) throws IOException {
        Stream<String> stringStream = Files.lines(Paths.get("D:\\data\\atati\\Newfolder(4)\\aa.java"), Charset.defaultCharset());
        stringStream.forEach(System.out::println);
    }
}

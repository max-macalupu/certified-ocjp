package org.oca.mocks.enthuware.missing_test_I;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_10 {
    public static void main(String[] args) throws URISyntaxException {
        Path path = Paths.get(new URI("file:\\d:\\data\\atati"));
        System.out.println(path);
    }
}
package org.oca.mocks.whizlabs.trial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created by max.macalupu on 3/10/2017.
 */
public class Question_01 {

    public static void main(String[] args) throws IOException {

        Path path1 = Paths.get("log.txt");
        Path path2 = Paths.get("filename.zip");

        Files.copy(path1,path2, StandardCopyOption.COPY_ATTRIBUTES);

    }

}

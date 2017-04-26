package org.oca.mocks.whizlabs.diagnostic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created by mx on 25/4/2017.
 */
public class Question_32 {

    public static void main(String[] args) throws IOException {
        processTHisAwesomeMethod();
    }

    private static void processTHisAwesomeMethod() throws IOException {
//        Files.copy(Paths.get("jquery.js"), Paths.get("index.html"), StandardCopyOption.COPY_ATTRIBUTES);
//        Files.copy(Paths.get("jquery.js"), Paths.get("index2.html"), StandardCopyOption.COPY_ATTRIBUTES);
//        Files.copy(Paths.get("jquery.js"), Paths.get("index.html"), StandardCopyOption.ATOMIC_MOVE);
        Files.copy(Paths.get("jquery.js"), Paths.get("index3.html"), StandardCopyOption.ATOMIC_MOVE);
//        Files.copy(Paths.get("jquery.js"), Paths.get("index.html"), StandardCopyOption.REPLACE_EXISTING);
//        Files.copy(Paths.get("jquery.js"), Paths.get("index.html"), StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
    }
}

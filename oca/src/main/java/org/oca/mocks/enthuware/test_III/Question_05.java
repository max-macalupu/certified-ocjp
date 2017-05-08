package org.oca.mocks.enthuware.test_III;

import java.io.IOException;
import java.nio.file.*;

/**
 * Created by mx on 4/5/2017.
 */
public class Question_05 {

    public static void main(String[] args) throws IOException, InterruptedException {
        processThis();
    }

    private static void processThis() throws IOException, InterruptedException {
        Path path = Paths.get("d:/data");
        WatchService watchService = FileSystems.getDefault().newWatchService();
        path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);
        WatchKey key = watchService.take();
        System.out.println(key.isValid());
    }
}
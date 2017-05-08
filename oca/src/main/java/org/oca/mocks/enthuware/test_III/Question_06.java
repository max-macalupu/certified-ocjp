package org.oca.mocks.enthuware.test_III;

import java.io.IOException;
import java.nio.file.*;

/**
 * Created by mx on 4/5/2017.
 */
public class Question_06 {
    public static void main(String[] args) throws IOException, InterruptedException {
        processThist();
    }

    private static void processThist() throws IOException, InterruptedException {
        Path path = Paths.get("d:\\data");
        WatchService watchService = FileSystems.getDefault().newWatchService();
        path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);
        while (true){
            WatchKey watchKey = watchService.take();
            System.out.println(watchKey.isValid());
            for(WatchEvent<?> watchEvent: watchKey.pollEvents()){
                WatchEvent.Kind<?> kind = watchEvent.kind();
                System.out.println(watchEvent+ " " + kind);
            }
            watchKey.reset();
        }
    }
}

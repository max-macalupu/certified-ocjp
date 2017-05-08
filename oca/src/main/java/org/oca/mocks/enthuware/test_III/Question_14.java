package org.oca.mocks.enthuware.test_III;

import java.io.IOException;
import java.nio.file.*;

/**
 * Created by mx on 5/5/2017.
 */
public class Question_14 {
    public static void main(String[] args) throws IOException, InterruptedException {
        processThis();
    }

    private static void processThis() throws IOException, InterruptedException {
        Path path = Paths.get("D:\\data");
        WatchService watchService = FileSystems.getDefault().newWatchService();
        path.register(watchService, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);
        WatchKey watchKey = watchService.take();
        System.out.println(watchKey.isValid());
        for(WatchEvent<?> event: watchKey.pollEvents()){
            WatchEvent.Kind<?> kind = event.kind();
        }
        System.out.println(watchKey.isValid());
    }
}



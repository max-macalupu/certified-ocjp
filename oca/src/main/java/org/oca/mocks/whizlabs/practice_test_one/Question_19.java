package org.oca.mocks.whizlabs.practice_test_one;

import java.io.IOException;
import java.nio.file.*;

/**
 * Created by mx on 25/3/2017.
 */
public class Question_19 {

    public static void main(String[] args) throws IOException, InterruptedException {
        WatchService watchService = FileSystems.getDefault().newWatchService();
        Paths.get("test").register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE);
        while(true){
            WatchKey watchKey = watchService.take();
            for(WatchEvent watchEvent: watchKey.pollEvents()){
                WatchEvent.Kind<?> kind = watchEvent.kind();
                System.out.println(watchEvent.context() + " " + kind.name());
            }
            watchKey.reset();
        }
    }
}
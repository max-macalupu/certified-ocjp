package org.oca.mocks.whizlabs.test_IV;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

/**
 * Created by mx on 18/4/2017.
 */
public class Question_23 {
    public static void main(String[] args) {
        processThisMethodAsFunction();
    }

    private static void processThisMethodAsFunction(){
        Path path = Paths.get("D:\\");
        try {
            WatchService watchService = path.getFileSystem().newWatchService();
            path.register(watchService, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);
            WatchKey watchKey = watchService.take();
            List<WatchEvent<?>> watchEventList = watchKey.pollEvents();
            for(WatchEvent watchEvent: watchEventList){
                if(watchEvent.kind() == StandardWatchEventKinds.ENTRY_CREATE){
                    System.out.println("Created");
                }
                if(watchEvent.kind() == StandardWatchEventKinds.ENTRY_DELETE){
                    System.out.println("Deleted");
                }
                if(watchEvent.kind() == StandardWatchEventKinds.ENTRY_MODIFY){
                    System.out.println("Modify");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
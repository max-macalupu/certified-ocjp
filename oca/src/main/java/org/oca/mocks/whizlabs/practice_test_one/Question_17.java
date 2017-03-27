package org.oca.mocks.whizlabs.practice_test_one;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.FileTime;
import java.util.List;

/**
 * Created by mx on 25/3/2017.
 */
public class Question_17 {

    public static void main(String[] args) throws IOException, InterruptedException {
        WatchService watchService = FileSystems.getDefault().newWatchService();
        Paths.get("test").register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);
        Files.setLastModifiedTime(Paths.get("test", "log.txt"), FileTime.fromMillis(System.currentTimeMillis()));
        WatchKey watchKey = watchService.take();
        List<WatchEvent<?>> list = watchKey.pollEvents();
        System.out.println("..." + list.size());
    }
}
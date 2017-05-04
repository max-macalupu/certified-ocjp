package org.oca.mocks.whizlabs.finaltest;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

/**
 * Created by mx on 29/4/2017.
 */
public class Question_27 {
    public static void main(String[] args) throws IOException, InterruptedException {
        processThisInterestingFunctionAsMethod();
    }

    private static void processThisInterestingFunctionAsMethod() throws IOException, InterruptedException {
        Path path = Paths.get("D:\\data");
        WatchService watchService = path.getFileSystem().newWatchService();
        path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);
//        WatchKey watchKey = watchService.poll(5000, TimeUnit.MILLISECONDS);
        WatchKey watchKey = watchService.take();
        List<WatchEvent<?>> watchKeyList = watchKey.pollEvents();
        for(WatchEvent watchEvent: watchKeyList){

        }
    }
}

class Test_Q{
    private final PathMatcher pathMatcher;


    public Test_Q(PathMatcher pathMatcher) {
        this.pathMatcher = pathMatcher;
    }
}


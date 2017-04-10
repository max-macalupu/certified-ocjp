package org.oca.mocks.whizlabs.test_III;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by mx on 10/4/2017.
 */
public class Question_15 {
    public static void main(String[] args) throws IOException {
        process_this_file_system_method();
    }
    private static void process_this_file_system_method() throws IOException {
        FileSystem fileSystem = FileSystems.getDefault();
        Iterable<Path> stringIterable = fileSystem.getRootDirectories();
        for(Iterable iterable: stringIterable){
            System.out.println(iterable);
            Files.walkFileTree(Paths.get(iterable.toString()), new MyFileVisitor_Q15());
        }
    }
}

class MyFileVisitor_Q15 implements FileVisitor<Path>{

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if(Files.isDirectory(file)){
            System.out.println(file.toAbsolutePath());
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }
}
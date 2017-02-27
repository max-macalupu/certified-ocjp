package org.oca.chapter07.test;

import java.io.IOException;
import java.nio.file.FileSystemException;

/**
 * Created by max.macalupu on 2/27/2017.
 */
public class Question_01 {

    public static void main(String[] args) {

    }
}

class Base{
    public void foo() throws FileSystemException{
        throw new FileSystemException("");
    }
}

class Deri extends Base{
    public void foo() throws FileSystemException, RuntimeException{
    }
}

class MyException extends FileSystemException{

    public MyException(String file) {
        super(file);
    }

    public MyException(String file, String other, String reason) {
        super(file, other, reason);
    }
}
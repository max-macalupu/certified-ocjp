package org.oca.chapter07.trywith;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by max.macalupu on 2/27/2017.
 */
public class ZipTextFile {

    public static final int CHUNCK = 1024;

    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("The passed parameters is 0");
        }
        String fileName = args[0];
        String zipFileName = fileName+".zip";
        byte[] buffer = new byte[CHUNCK];

        try(ZipOutputStream zipFile = new ZipOutputStream(new FileOutputStream(zipFileName));
            FileInputStream fileIn = new FileInputStream(fileName)){

            zipFile.putNextEntry(new ZipEntry(fileName));
            int lenRead = 0;
            while((lenRead = fileIn.read(buffer))>0){
                zipFile.write(buffer, 0, lenRead);
            }
        } catch (Exception e) {
            System.out.println("The caught exception is: " + e);
            System.out.println("The suppressed exception are: " );
            for(Throwable throwable: e.getSuppressed()){
                System.out.println(throwable);
            }
        }
    }
}

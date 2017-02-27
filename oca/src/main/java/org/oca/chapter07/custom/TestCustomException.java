package org.oca.chapter07.custom;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by max.macalupu on 2/27/2017.
 */
public class TestCustomException {

    public static int readIntFromFile(){
        Scanner scanner = new Scanner(System.in);
        int typeInt = 0;
        try{
            typeInt = scanner.nextInt();
        }catch(NoSuchElementException ex){
            System.out.println("Element not received and throwing exception");
            throw new InvalidInputException("Error message inside of custome exception", ex);
        }catch(Exception ex){
            System.out.println("Error: encountered an exception");
        }
        return  typeInt;
    }

    public static void main(String[] args) {

        try{
            readIntFromFile();
        }catch(InvalidInputException ex){
            System.out.println("Error: invalid input in console");
            System.out.println("Error: cause of the error" + ex.getCause());
            for(Throwable throwable: ex.getSuppressed()){
                System.out.println(throwable.toString());
            }
        }
    }
}

package org.oca.chapter07.scaner;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by max.macalupu on 2/27/2017.
 */
public class ScanInt5 {
    public static void main(String [] args){
        String hundred = "";
        System.out.printf("Please enter the number: %s %n", hundred);
        Scanner scanner = new Scanner(hundred);
        try{
            System.out.println("Please enter the number: " + scanner.nextInt());
        }catch(NoSuchElementException | IllegalStateException ex){
            System.out.println("Error in Such element exception: " + ex.toString());
        }
    }
}

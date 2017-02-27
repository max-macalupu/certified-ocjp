package org.oca.chapter07.scaner;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by max.macalupu on 2/27/2017.
 */
public class ScanInt2 {
    public static void main(String [] args){
        try{
            System.out.println("Please enter the number: ");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the number: " + scanner.nextInt());
        }catch(InputMismatchException ex){
            System.out.println("Error in enter number: " + ex.toString());
        }
    }
}

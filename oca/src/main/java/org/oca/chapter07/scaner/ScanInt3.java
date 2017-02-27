package org.oca.chapter07.scaner;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by max.macalupu on 2/27/2017.
 */
public class ScanInt3 {
    public static void main(String [] args){
//        String hundred = "100";
//        String hundred = "hundred";
        String hundred = "";
        System.out.printf("Please enter the number: %s %n", hundred);
        try{
            Scanner scanner = new Scanner(hundred);
            System.out.println("Please enter the number: " + scanner.nextInt());
        }catch(InputMismatchException ex){
            System.out.println("Error in enter number: " + ex.toString());
        }
    }
}

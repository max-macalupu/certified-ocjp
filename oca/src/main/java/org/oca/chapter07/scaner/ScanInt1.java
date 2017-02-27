package org.oca.chapter07.scaner;

import java.util.Scanner;

/**
 * Created by max.macalupu on 2/27/2017.
 */
public class ScanInt1 {

    public static void main(String [] args){
        System.out.println("Please enter the number");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number" + scanner.nextInt());
    }
}

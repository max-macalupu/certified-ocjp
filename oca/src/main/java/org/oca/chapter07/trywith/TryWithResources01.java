package org.oca.chapter07.trywith;

import java.util.Scanner;

/**
 * Created by max.macalupu on 2/27/2017.
 */
public class TryWithResources01 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("You entered the number: " + scanner.nextInt());
        }catch(Exception e){
            System.out.println("There was the error " + e.toString());
        }
    }
}

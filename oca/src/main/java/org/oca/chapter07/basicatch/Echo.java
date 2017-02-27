package org.oca.chapter07.basicatch;

import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * Created by max.macalupu on 2/27/2017.
 */
public class Echo {

    public static void main(String [] args){
        if(args.length == 0){
            System.out.println("Error: No input passed to echo command");
            throw new IllegalArgumentException("Error is receiving parameters");
        }else{
            for(String str: args){
                System.out.printf("errro: No input passed to echo command, %d", str);
            }
        }
    }
}
package org.oca.chapter11.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Created by mx on 19/2/2017.
 */
public class PrimeNumber {

    public static boolean isPrime(long number){
        for(int i=2; i<=number/2; i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args){
        List<Long> arrayList = Arrays.asList(new Long[]{4L,523L,41L,5L});
        
        Stream<Long> streamList = arrayList.stream();

        long numberPares = streamList.filter(x -> x%2==0).count();

        long numOfPrimes = LongStream.rangeClosed(2,100000).parallel().filter(PrimeNumber::isPrime).count();

        System.out.printf("Numberof prime in range: %d %n",numOfPrimes);

        System.out.printf("Numberof pares in range: %d",numberPares);
    }
}
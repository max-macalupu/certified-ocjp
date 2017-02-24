package org.oca.chapter6.tocollection;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by max.macalupu on 2/23/2017.
 */
public class CollectorsToList {

    public static void main(String [] args){
        String frenchList = "un:deux:trois:quatre";
        List gmailList = Pattern.compile(":").splitAsStream(frenchList).collect(Collectors.toList());
        gmailList.forEach(System.out::println);
    }
}
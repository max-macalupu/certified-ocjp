package org.oca.chapter11.concurrentcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by mx on 18/2/2017.
 */
public class ModifyingList {

    public static void main(String [] args){
        List<String> listNames = new ArrayList<>();
        listNames.add("Max");
        listNames.add("Leo");
        listNames.add("Junior");
        listNames.add("Jose");

        Iterator iterator = listNames.iterator();
        while(iterator.hasNext()){
            System.out.println("Data from parameter: " + iterator.next());
            listNames.add("Jose");
        }

    }

}

package org.oca.chapter08.zonetime;

import java.time.ZoneId;
import java.util.Set;

/**
 * Created by max.macalupu on 2/28/2017.
 */
public class ZoneValue {


    public static void show_my_default_zone(){
        System.out.println("My Zone ID is: " + ZoneId.systemDefault());
    }

    public static void show_all_default_zone(){
        Set<String> zones = ZoneId.getAvailableZoneIds();
        System.out.println("Total numbers of all zones: " + zones.size());
        zones.forEach(System.out::println);
    }

    public static void main(String[] args) {
        show_my_default_zone();
        show_all_default_zone();
    }
}

package org.oca.mocks.whizlabs.test_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mx on 30/3/2017.
 */
public class Question_09 {
    public static void main(String[] args) {
//        Car_Q09 car_q09 = new Vehicle_Q09();
        Vehicle_Q09 vehicle_q09 = new Car_Q09();
        List<? extends Vehicle_Q09> list1 = new ArrayList<>();
        List<? super Vehicle_Q09> list2 = new ArrayList<>();
//        list1.add(new Car_Q09());
//        list1.addAll(Arrays.new Car_Q09());
//        list2.add(new Car_Q09());
        processList1(list1);

        List<Car_Q09> carQ09List = Arrays.asList(new Car_Q09(), new Car_Q09(), new Car_Q09(), new Car_Q09());
        List<Thing_09> thing09sList = Arrays.asList(new Thing_09(), new Thing_09(), new Thing_09(), new Thing_09());
        List<Object> objectList = Arrays.asList(new Integer(1), new Double(4));
        processList1(carQ09List);
//        processList1(objectList);
        processList2(thing09sList);
        processList2(objectList);
    }

    public static void processList1(List<? extends Vehicle_Q09> vehicleQ09List){
        for(Vehicle_Q09 vehicle_q09: vehicleQ09List){
            System.out.println(vehicle_q09);
        }
    }

    public static void processList2(List<? super Vehicle_Q09> vehicleQ09List){
        for(Object vehicle_q09: vehicleQ09List){
            System.out.println(vehicle_q09);
        }
//        for(Thing_09 thing_09: vehicleQ09List){
//            System.out.println(thing_09);
//        }
    }
}

class Thing_09 extends  Object{
    public Thing_09() {
    }
}

class Vehicle_Q09 extends Thing_09{
    public Vehicle_Q09() {
    }
}

class Car_Q09 extends Vehicle_Q09{
    public Car_Q09() {
    }
}
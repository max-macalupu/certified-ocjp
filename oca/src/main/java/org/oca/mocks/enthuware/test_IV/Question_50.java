package org.oca.mocks.enthuware.test_IV;

/**
 * Created by mx on 8/5/2017.
 */
public class Question_50 {
    public static void main(String[] args) {
        House_Q50 house_q50 = new MyHouse_Q50();
        System.out.println(house_q50.getMessage());
    }
}

interface House2_Q50{
    public default String getMessage(){
        return "Hello WOrld";
    }
}

interface House_Q50{
    public default String getMessage(){
        return "Hello WOrld";
    }
}

interface Bungalow_Q50 extends House_Q50{
    public default String getMessage(){
        return "Hello WOrld Bungalow";
    }
}

interface MyHouseInt_Q50 extends House_Q50, Bungalow_Q50{

}

class MyHouse_Q50 implements House_Q50, Bungalow_Q50 {

}
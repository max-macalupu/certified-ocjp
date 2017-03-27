package org.oca.mocks.whizlabs.practice_test_one;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mx on 25/3/2017.
 */
public class Question_08 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<? super String> subList = new ArrayList<>();
        list.addAll(new ArrayList<>());
//        list.addAll(subList);
        List<Object> data = new ArrayList<>();
        data.addAll(subList);

//        List<? super Dog_Q8> superAnimalList = new ArrayList<>();
        List<? extends Dog_Q8> superAnimalList = new ArrayList<>();
        List<Pequinez_Q8> animalList = new ArrayList<>();
//        superAnimalList.addAll(animalList);

    }
}


class Animal_Q8{

}

class Dog_Q8 extends Animal_Q8{

}

class Cat_Q8 extends Animal_Q8{

}

class Pequinez_Q8 extends Dog_Q8{

}
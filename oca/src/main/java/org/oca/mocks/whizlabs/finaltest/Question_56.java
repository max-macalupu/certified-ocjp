package org.oca.mocks.whizlabs.finaltest;

/**
 * Created by mx on 30/4/2017.
 */
public class Question_56 {
    public static void main(String[] args) {
        Animal_Q56 animal_q56 = new Animal_Q56();
        Run_Q56 run_q56 = new Animal_Q56();
        Walk_Q56 walk_q56 = new Animal_Q56();
        Run_Q56 run_q561 = new Human_Q56();

        System.out.println(animal_q56.getSpeed());
        System.out.println(run_q56.getSpeed());
        System.out.println(walk_q56.getSpeed());
        System.out.println(run_q561.getSpeed());
    }
}

interface Run_Q56{
    public default int getSpeed(){
        return 5;
    }
}

interface Walk_Q56{
    public default int getSpeed(){
        return 6;
    }
}

class Human_Q56 implements Run_Q56{

}

class Animal_Q56 implements Run_Q56, Walk_Q56{

    public int getSpeed() {
        return 3;
    }
}
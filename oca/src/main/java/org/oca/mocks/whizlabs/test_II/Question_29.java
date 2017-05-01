package org.oca.mocks.whizlabs.test_II;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by mx on 8/4/2017.
 */
public class Question_29 {
    public static void main(String[] args) {
        List<Lorien_Q29> lorienQ29List = Arrays.asList(new Lorien_Q29("Malena", 29),
                                                        new Lorien_Q29("Rocio",10),
                                                        new Lorien_Q29("Maria", 11));
//        lorienQ29List.stream().sorted().forEach(System.out::print);
        lorienQ29List.stream().sorted(Lorien_Q29::compareTo).forEach(System.out::print);
        System.out.println();
        lorienQ29List.stream().sorted(Comparator.comparing(lorien_q29 -> lorien_q29.getName())).forEach(System.out::print);
        System.out.println();
//        lorienQ29List.stream().sorted(MyComparator::compare);
    }
}

class MyComparator implements Comparator<Lorien_Q29>{
    @Override
    public int compare(Lorien_Q29 o1, Lorien_Q29 o2) {
        return o1.compareTo(o2);
    }
}

class Lorien_Q29 implements Comparable<Lorien_Q29>{
    private int age;
    private String name;

    public Lorien_Q29(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Lorien_Q29 o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Lorien_Q29{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
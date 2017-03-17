package org.oca.mocks.whizlabs.diagnostic;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by mx on 17/3/2017.
 */
public class Question_16 {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
            new Person("mx", Person.Gender.FEMALE),
            new Person("lo", Person.Gender.MALE),
            new Person("liam", Person.Gender.MALE),
            new Person("jr", Person.Gender.FEMALE)
        );

//        System.out.println(personList.stream().collect(Collectors.toMap(Person::getGender, Person::getName)));
//        Map<Person.Gender, String> data = personList.stream().collect(Collectors.toMap(Person::getGender, Person::getName, (s, s2) -> s));
        Map<Person.Gender, List<Person>> data = personList.stream().distinct().collect(Collectors.groupingBy(Person::getGender));
        System.out.println(data);
    }

}

class Person{
    private String name;
    private Gender gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

    enum Gender{
        MALE,FEMALE
    }
}

package org.oca.mocks.whizlabs.practice_test_one;

import java.util.function.Supplier;

/**
 * Created by mx on 25/3/2017.
 */
public class Question_35 {
    public static void main(String[] args) {
        Person_Q35 person_q35 = new Person_Q35("Donnald", "Trump");
        Supplier<String> supplier = person_q35::fullName;
        System.out.println(supplier.get());
        System.out.println(supplier);
    }
}

class Person_Q35{

    private String firstName;
    private String lastName;

    public Person_Q35(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String fullName(){
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
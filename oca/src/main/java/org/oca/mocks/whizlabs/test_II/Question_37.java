package org.oca.mocks.whizlabs.test_II;

import java.util.*;

/**
 * Created by mx on 8/4/2017.
 */
public class Question_37 {

    public static final Long SIZE_DATA = 10000L;

    public static Map<Integer, List<Person_Q37>> mapWithData = new HashMap<>();

    public static void main(String[] args) {

        for(int i=0; i<SIZE_DATA; i++){
            Person_Q37 data = getPersonQ37Instance();
            mapWithData.computeIfAbsent(data.getCode(), k-> new ArrayList<>()).add(data);
        }


//        Person_Q37 person_q37 = new Person_Q37.Builder().code(1).name("maria").build();
//        Person_Q37 person_q37_1 = new Person_Q37.Builder().code(1).name("max").build();
//        Person_Q37 person_q37_2 = new Person_Q37.Builder().code(1).name("leo").build();
//
//        Question_37 q = new Question_37();
//        q.mapWithData.computeIfAbsent(person_q37.getCode(), k-> new ArrayList<>()).add(person_q37);
//        q.mapWithData.computeIfAbsent(person_q37_1.getCode(), k-> new ArrayList<>()).add(person_q37_1);
//        q.mapWithData.computeIfAbsent(person_q37_2.getCode(), k-> new ArrayList<>()).add(person_q37_2);

        System.out.println(mapWithData);
    }

    private static Person_Q37 getPersonQ37Instance(){
        int age = new Random().nextInt(1000);
        return new Person_Q37(age, "NAME_" + age);
    }
}

class Person_Q37{
    private Integer code;
    private String name;

    public Person_Q37(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person_Q37{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }

    public static class Builder{
        private String name;
        private Integer code;
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder code(Integer code){
            this.code = code;
            return this;
        }

        public Person_Q37 build(){
            return new Person_Q37(code, name);
        }
    }
}
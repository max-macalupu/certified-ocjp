package org.oca.mocks.whizlabs.test_II;

import java.util.*;

/**
 * Created by mx on 24/4/2017.
 */
public class Question_32 {
    public static void main(String[] args) {
        processThisAksfullFunction();
    }

    private static void processThisAksfullFunction(){
        Map<Integer, Student_Q32> q12Map = new HashMap<>();
        Map<Integer, Student_Q32> q22Map = new HashMap<>();


        q12Map.put(1, new Student_Q32(1, "Mx"));
        q12Map.put(2, new Student_Q32(1, "Lo"));

        q22Map.put(3, new Student_Q32(1, "Jr"));
        q22Map.put(4, new Student_Q32(1, "Sr"));

        List<Map<Integer, Student_Q32>> mapList = Arrays.asList(q12Map, q22Map);
        mapList.stream().flatMap( map-> map.values().stream()).forEach(System.out::print);

    }
}

class Student_Q32{
    private int id;
    private String name;

    public Student_Q32(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  String.valueOf(id);
    }
}

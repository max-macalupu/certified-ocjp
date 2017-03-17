package org.oca.mocks.whizlabs.diagnostic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by mx on 17/3/2017.
 */
public class Question_09 {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student("Max", Student.Facultad.BUSINESS),
            new Student("Jose", Student.Facultad.ENGINEER),
            new Student("Luis", Student.Facultad.ENGINEER),
            new Student("Maria", Student.Facultad.BUSINESS)
        );
        students.stream().collect(Collectors.partitioningBy(student -> student.getFacultad().equals(Student.Facultad.BUSINESS))).forEach((aBoolean, stud) -> System.out.println(stud));
    }
}

class Student{
    private String name;
    private Facultad facultad;

    public Student(String name, Facultad facultad) {
        this.name = name;
        this.facultad = facultad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    enum Facultad{
        BUSINESS,ENGINEER
    }
}
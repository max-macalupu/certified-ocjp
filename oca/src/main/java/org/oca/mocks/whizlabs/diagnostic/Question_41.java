package org.oca.mocks.whizlabs.diagnostic;

import java.util.Arrays;
import java.util.List;

/**
 * Created by max.macalupu on 3/17/2017.
 */
public class Question_41 {

    public static void main(String[] args) {

        List<Students> studentList = Arrays.asList(
            new Students("max", 1.6, Students.Faculty.ENGINEER),
            new Students("leo", 3.2, Students.Faculty.MATH),
                new Students("jr", 1.8, Students.Faculty.ENGINEER),
                new Students("piero", 6.16, Students.Faculty.ENGINEER),
                new Students("pul", 9.08, Students.Faculty.MATH)
        );

        //when is empty it throw a exception
        System.out.println(studentList.stream().filter(s -> s.getFaculty().equals(Students.Faculty.ENGINEER) && s.getMark() > 1.7 )
                .mapToDouble(x -> x.getMark()).peek(data -> System.out.println("-> "+ data + ". ")).average().orElse(1000));
    }
}

class Students {

    private String name;
    private double mark;
    private Faculty faculty;

    public Students(String name, double mark, Faculty faculty) {
        this.name = name;
        this.mark = mark;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    enum Faculty{
        ENGINEER, MATH
    }
}
package org.oca.mocks.enthuware.missing_test_I;

import sun.plugin2.gluegen.runtime.CPU;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_04 {
    public static void main(String[] args) {
        List<Course_Q04> courseQ04List = Arrays.asList(new Course_Q04("tittle1", "desc1"),
                                                        new Course_Q04("tittle2", "desc2"),
                                                        new Course_Q04("tittle3", "desc3"));
        courseQ04List.stream().collect(Collectors.groupingBy(Course_Q04::getDescription)).forEach((a,b) -> System.out.println(b));
    }
}


class Course_Q04{
    private String tittle;
    private String description;

    public Course_Q04(String tittle, String description) {
        this.tittle = tittle;
        this.description = description;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course_Q04{" +
                "tittle='" + tittle + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
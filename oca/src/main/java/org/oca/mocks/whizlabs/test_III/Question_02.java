package org.oca.mocks.whizlabs.test_III;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by mx on 9/4/2017.
 */
public class Question_02 {
    public static void main(String[] args) {
        process_this_interesting_question();
    }

    private static void process_this_interesting_question(){
        Comparator<Student_Q02> comparator = (x, y) -> x.getName().compareTo(y.getName());
        Comparator<Student_Q02> comparator2 = comparator.thenComparing(Student_Q02::getId);
        List<Student_Q02> data = getDataForTheQuestion();
        boolean dataBool = data.stream().sorted(comparator2).peek(System.out::print).allMatch( x-> x!=null);
        System.out.println();
        data.forEach(System.out::println);
        System.out.println(dataBool);

    }

    private static List<Student_Q02> getDataForTheQuestion(){
        return Arrays.asList(
                new Student_Q02(2, "Lax"),
                new Student_Q02(1, "Maria"),
                new Student_Q02(10, "Maria"),
                new Student_Q02(5, "Maria"),
                new Student_Q02(4, "Jose"),
                new Student_Q02(5, "Simon"),
                new Student_Q02(3, "memo")
        );
    }
}

class Student_Q02{
    private int id;
    private String name;

    public Student_Q02(int id, String name) {
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
        return "Student_Q02{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
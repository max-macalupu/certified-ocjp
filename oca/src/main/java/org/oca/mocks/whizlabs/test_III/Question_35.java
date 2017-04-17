package org.oca.mocks.whizlabs.test_III;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by AVANTICA TECHNOLOGIES on 4/11/2017.
 */
public class Question_35 {
    public static void main(String[] args) {
        processThisAwesomeMethodForMyCertificationTest();
    }

    private static void processThisAwesomeMethodForMyCertificationTest(){
        List<Student_Q35> data = Question_35.RepositoryOfData.getStudentsWithDataForProcessInBulk();
        data.stream().filter(new Student_Q35.Filter()).peek(System.out::println).count();
    }

    private static class RepositoryOfData{

        public static List<Student_Q35> getStudentsWithDataForProcessInBulk(){
            return Arrays.asList(new Student_Q35("First", 5.3),
                    new Student_Q35("Second", 2.4),
                    new Student_Q35("Second", 12.4),
                    new Student_Q35("Second", 21.4),
                    new Student_Q35("Second", 100.4),
                    new Student_Q35("Second", 2.4),
                    new Student_Q35("Third", 1.3)
            )        ;
        }

    }

}

class Student_Q35 {
    private String tittle;
    private Double rating;

    public Student_Q35(String tittle, Double rating) {
        this.tittle = tittle;
        this.rating = rating;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    static class Filter implements Predicate<Student_Q35>{

        @Override
        public boolean test(Student_Q35 student_q35) {
            return student_q35.getRating() >= 9;
        }
    }

    @Override
    public String toString() {
        return "Student_Q35{" +
                "tittle='" + tittle + '\'' +
                ", rating=" + rating +
                '}';
    }
}
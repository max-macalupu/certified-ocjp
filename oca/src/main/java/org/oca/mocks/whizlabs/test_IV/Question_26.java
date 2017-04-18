package org.oca.mocks.whizlabs.test_IV;

import java.util.Arrays;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

/**
 * Created by mx on 18/4/2017.
 */
public class Question_26 {
    public static void main(String[] args) {
        processThisInterestingMethodAsFunction();
    }

    private static void processThisInterestingMethodAsFunction(){
        Stream<Vendor_Q26> intStream = Arrays.asList(new Vendor_Q26("mx", 1),
                                                        new Vendor_Q26("lo", 6),
                                                        new Vendor_Q26("jr", 11)).stream();
        ToIntFunction<Vendor_Q26> toIntFunction = (v)-> v.getRating();
        System.out.println(intStream.mapToInt(toIntFunction).skip(1).sum());
    }
    static class Vendor_Q26{

        private String name;
        private int rating;

        public Vendor_Q26(String name, int rating) {
            this.name = name;
            this.rating = rating;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getRating() {
            return rating;
        }
        public void setRating(int rating) {
            this.rating = rating;
        }
    }

}

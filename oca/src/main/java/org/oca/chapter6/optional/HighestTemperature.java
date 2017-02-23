package org.oca.chapter6.optional;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * Created by max.macalupu on 2/22/2017.
 */
public class HighestTemperature {

    public static void selectHighestTemperature(Stream<Double> doubleStream){
        System.out.println(doubleStream.max(Double::compareTo));
    }

    public static void selectHighestTemperature2(Stream<Double> doubleStream){
        Optional<Double> optionalDouble = doubleStream.max(Double::compareTo);
        if(optionalDouble.isPresent()){
            System.out.println(optionalDouble.get());
        }
    }

    public static void selectHighestTemperature3(Stream<Double> doubleStream){
        Optional<Double> optionalDouble = doubleStream.max(Double::compareTo);
        optionalDouble.ifPresent(System.out::println);
    }

    public static void selectHighestTemperature_in_short_way(Stream<Double> doubleStream){
        doubleStream.max(Double::compareTo).ifPresent(System.out::println);
    }

    public static void selectHighestTemperature_primitive(DoubleStream doubleStream){
        OptionalDouble optionalDouble = doubleStream.max();
        optionalDouble.ifPresent(System.out::println);
    }

    public static void main(String [] args){
        selectHighestTemperature(Stream.of(4.9, 1.4, 6.21, 6.2, 7.2));
        selectHighestTemperature2(Stream.of(4.9, 1.4, 6.21, 6.2, 7.2));
        selectHighestTemperature3(Stream.of(4.9, 1.4, 6.21, 6.2, 7.2));
        selectHighestTemperature_in_short_way(Stream.of(4.9, 1.4, 6.21, 6.2, 7.2));
        selectHighestTemperature_primitive(DoubleStream.of(4.9, 10.2, 1.4, 6.21, 6.2, 7.2));
    }
}
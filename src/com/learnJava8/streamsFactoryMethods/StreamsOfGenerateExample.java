package com.learnJava8.streamsFactoryMethods;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamsOfGenerateExample {

    public static void main(String[] args) {
        Stream.of("sand", "kamal", "naveen").forEach(System.out::println);
        Stream.iterate(1, n -> n * 2).limit(10).forEach(System.out::println);
        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream.generate(integerSupplier).limit(20).forEach(System.out::println);
    }
}

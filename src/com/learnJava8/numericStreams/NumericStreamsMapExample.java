package com.learnJava8.numericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsMapExample {

    private static List<Integer> mapToObject() {
        return IntStream.rangeClosed(1, 10)
                .mapToObj(value -> new Integer(value))
                .collect(Collectors.toList());
    }

    private static long mapToLong() {
        return IntStream.rangeClosed(1, 10)
                .mapToLong(Long::valueOf)
                .sum();
    }

    private static double mapToDouble() {
        return IntStream.rangeClosed(1, 10)
                .mapToDouble(Double::valueOf)
                .sum();
    }

    public static void main(String[] args) {

        System.out.println("mapToObject : " + mapToObject());
        System.out.println("mapToLong : " + mapToLong());
        System.out.println("mapToDouble : " + mapToDouble());

    }


}

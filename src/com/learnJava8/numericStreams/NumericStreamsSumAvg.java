package com.learnJava8.numericStreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamsSumAvg {

    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 3).sum();
        System.out.println("sum : " + sum);

        OptionalInt max = IntStream.rangeClosed(1, 3).max();
        System.out.println("Max : " + max.getAsInt());

        OptionalInt min = IntStream.rangeClosed(1, 3).min();
        System.out.println("Max : " + min.getAsInt());

        OptionalDouble avg = IntStream.rangeClosed(1, 3).average();
        System.out.println("avg : " + avg.getAsDouble());
    }
}

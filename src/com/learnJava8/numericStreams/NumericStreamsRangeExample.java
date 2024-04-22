package com.learnJava8.numericStreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamsRangeExample {

    public static void main(String[] args) {
        System.out.println("IntStream=================");
        System.out.println("IntStream Range :");
        IntStream.range(1, 10).forEach(System.out::print);
        System.out.println();
        System.out.println("IntStream Range count :" + IntStream.range(1, 10).count());
        System.out.println("IntStream RangeClosed :");
        IntStream.rangeClosed(1, 10).forEach(System.out::print);
        System.out.println();
        System.out.println("IntStream RangeClosed count :" + IntStream.rangeClosed(1, 10).count());

        System.out.println("LongStream=================");

        System.out.println("LongStream Range :");
        LongStream.range(1, 10).forEach(System.out::print);
        System.out.println();
        System.out.println("LongStream Range count :" + IntStream.range(1, 10).count());
        System.out.println("LongStream RangeClosed :");
        LongStream.rangeClosed(1, 10).forEach(System.out::print);
        System.out.println();
        System.out.println("LongStream RangeClosed count :" + LongStream.rangeClosed(1, 10).count());

        System.out.println("DoubleStream=================");
        System.out.println("DoubleStream RangeClosed :");
        IntStream.rangeClosed(1, 10).asDoubleStream().forEach(System.out::print);
    }
}

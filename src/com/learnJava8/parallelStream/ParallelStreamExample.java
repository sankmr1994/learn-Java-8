package com.learnJava8.parallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    private static long checkPerformance(Supplier<Integer> getSum, int noOfTimes) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < noOfTimes; i++) {
            getSum.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static int sumUsingSequentialStream() {
        return IntStream.rangeClosed(1, 100000).sum();
    }

    private static int sumUsingParallelStream() {
        return IntStream.rangeClosed(1, 100000).parallel().sum();
    }

    public static void main(String[] args) {

        System.out.println("Available processor in the machine : " + Runtime.getRuntime().availableProcessors());

        System.out.println("Sum using sequential stream : " + sumUsingSequentialStream());
        System.out.println("Sum using parallel stream : " + sumUsingParallelStream());

        System.out.println("Sum using sequential stream performance: " + checkPerformance(() -> sumUsingSequentialStream(), 20));
        System.out.println("Sum using parallel stream performance: " + checkPerformance(() -> sumUsingParallelStream(), 20));

    }
}

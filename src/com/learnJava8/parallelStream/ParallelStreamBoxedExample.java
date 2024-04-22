package com.learnJava8.parallelStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamBoxedExample {

    private static int sequentialStream(List<Integer> nums) {
        long startTime = System.currentTimeMillis();
        int sum = nums.stream()
                .reduce(0, (a, b) -> a + b);
        long endTime = System.currentTimeMillis();
        System.out.println("Duration of sequential :" + (endTime - startTime));
        return sum;
    }

    private static int parallelStream(List<Integer> nums) {
        long startTime = System.currentTimeMillis();
        int sum = nums.stream()
                .parallel()
                .reduce(0, (a, b) -> a + b);
        long endTime = System.currentTimeMillis();
        System.out.println("Duration of parallel :" + (endTime - startTime));
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> nums = IntStream.rangeClosed(1, 100000)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(sequentialStream(nums));
        System.out.println(parallelStream(nums));


    }
}

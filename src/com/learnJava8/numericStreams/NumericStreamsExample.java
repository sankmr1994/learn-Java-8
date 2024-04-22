package com.learnJava8.numericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

    private static int sum(List<Integer> nums) {
        return nums.stream()
                .reduce(0, (a, b) -> a + b);
    }

    private static int sumIntStream() {
        return IntStream.rangeClosed(1, 4).sum();
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        System.out.println("Sum without IntStream " + sum(nums));
        System.out.println("Sum with IntStream " + sumIntStream());
    }
}

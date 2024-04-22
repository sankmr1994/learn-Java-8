package com.learnJava8.numericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnBoxingExample {

    private static List<Integer> boxing() {
        //Primitive to Wrapper
        return IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
    }

    private static int unBoxing(List<Integer> nums) {
        //Wrapper to Primitive
        return nums.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {

        System.out.println("Boxing : " + boxing());
        List<Integer> nums = boxing();
        System.out.println("UnBoxing : " + unBoxing(nums));
    }
}

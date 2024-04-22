package com.learnJava8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class StreamsMinMaxExample {

    private static Optional<Integer> getMaxValue(List<Integer> nums) {
        return nums.stream()
                .reduce((a, b) -> Math.max(a, b));
    }

    private static Optional<Integer> getMinValue(List<Integer> nums) {
        return nums.stream()
                .reduce((a, b) -> Math.min(a, b));
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(-8, 2, 5, 1, 7, 3);
        Optional<Integer> optionalMax = getMaxValue(nums);
        if (optionalMax.isPresent()) {
            System.out.println("Max value is : " + optionalMax.get());
        }
        Optional<Integer> optionalMin = getMinValue(nums);
        if (optionalMin.isPresent()) {
            System.out.println("Min value is : " + optionalMin.get());
        }
    }
}

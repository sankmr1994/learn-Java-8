package com.learnJava8.streams;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitAndSkipExample {

    private static Optional<Integer> limitElements(List<Integer> nums) {
        return nums.stream()
                .limit(2)
                .reduce((a, b) -> a + b);
    }

    private static Optional<Integer> skipElements(List<Integer> nums) {
        return nums.stream()
                .skip(3)
                .reduce((a, b) -> a + b);
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> optionalLimit = limitElements(nums);
        if (optionalLimit.isPresent()) {
            System.out.println("Limit result is : " + optionalLimit.get());
        }
        Optional<Integer> optionalSkip = skipElements(nums);
        if (optionalSkip.isPresent()) {
            System.out.println("Skip result is : " + optionalSkip.get());
        }

    }
}

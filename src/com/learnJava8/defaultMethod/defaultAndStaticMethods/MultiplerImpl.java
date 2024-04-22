package com.learnJava8.defaultMethod.defaultAndStaticMethods;

import java.util.List;

public class MultiplerImpl implements Multiplier {
    @Override
    public int multiply(List<Integer> nums) {
        return nums.stream()
                .reduce(1, (a, b) -> a * b);
    }

    @Override
    public int size(List<Integer> nums) {
        System.out.println("Inside MultiplerImpl class");
        return nums.size();
    }
}

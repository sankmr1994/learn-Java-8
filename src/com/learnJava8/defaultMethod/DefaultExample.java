package com.learnJava8.defaultMethod;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DefaultExample {


    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 4, 3, 2, 7, 6);

        nums.sort(Comparator.naturalOrder());
        System.out.println(nums);

        nums = Arrays.asList(1, 4, 3, 2, 7, 6);
        nums.sort(Comparator.reverseOrder());
        System.out.println(nums);

    }
}

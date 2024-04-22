package com.learnJava8.defaultMethod.defaultAndStaticMethods;

import com.learnJava8.data.Student;

import java.util.List;

public interface Multiplier {

    int multiply(List<Integer> nums);

    default int size(List<Integer> nums) {
        System.out.println("Inside Multiplier interface");
        return nums.size();
    }

    static boolean isEmpty(List<Integer> nums) {
        return nums == null || nums.size() == 0;
    }


}

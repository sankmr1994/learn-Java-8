package com.learnJava8.defaultMethod.defaultAndStaticMethods;

import java.util.Arrays;
import java.util.List;

public class MutiplierClient {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3);
        Multiplier multiplier = new MultiplerImpl();
        System.out.println("Mutiply : " + multiplier.multiply(nums));
        System.out.println("Default size method : " + multiplier.size(nums));
        System.out.println("Static isEmpty method : " + Multiplier.isEmpty(nums));
    }
}

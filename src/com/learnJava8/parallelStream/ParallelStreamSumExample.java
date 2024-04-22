package com.learnJava8.parallelStream;

import java.util.stream.IntStream;

public class ParallelStreamSumExample {

    public static void main(String[] args) {
        Sum sum1 = new Sum();
        IntStream.rangeClosed(1, 10000).forEach(sum1::performSum);

        System.out.println("Sequential sum : " + sum1.getTotal());

        Sum sum2 = new Sum();
        IntStream.rangeClosed(1, 10000).parallel().forEach(sum2::performSum);

        System.out.println("Sequential sum : " + sum2.getTotal());
    }
}

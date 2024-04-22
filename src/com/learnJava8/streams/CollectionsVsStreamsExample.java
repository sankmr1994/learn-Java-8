package com.learnJava8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionsVsStreamsExample {

    public static void main(String[] args) {
        //We can add,remove in collection
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(3);
        integers.add(5);
        System.out.println(integers);
        integers.remove(1);
        System.out.println(integers);

        //but in streams we can't do above operations

        //We can use collections data any number of times
        for(int i : integers)
            System.out.println(i);
        for(int i : integers)
            System.out.println(i);

        //but in streams we can you stream values only once
        Stream<Integer> integerStream =  integers.stream();
        integerStream.forEach(System.out::println);
        integerStream.forEach(System.out::println);




    }
}

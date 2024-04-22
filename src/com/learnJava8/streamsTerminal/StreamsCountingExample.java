package com.learnJava8.streamsTerminal;

import com.learnJava8.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsCountingExample {

    private static long count() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa() > 3.5)
                .collect(Collectors.counting());
    }

    public static void main(String[] args) {
        System.out.println("Count : " + count());
    }
}

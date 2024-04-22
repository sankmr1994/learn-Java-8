package com.learnJava8.parallelStream;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample2 {

    private static void sequentialStream() {
        long startTime = System.currentTimeMillis();

        StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        long endTime = System.currentTimeMillis();
        System.out.println("Execution time to run sequential stream :" + (endTime - startTime));
    }

    private static void parallelStream() {
        long startTime = System.currentTimeMillis();

        StudentDataBase.getAllStudents()
                .stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        long endTime = System.currentTimeMillis();
        System.out.println("Execution time to run parallel stream :" + (endTime - startTime));
    }

    public static void main(String[] args) {
        sequentialStream();
        parallelStream();
    }
}

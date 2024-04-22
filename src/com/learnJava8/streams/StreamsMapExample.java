package com.learnJava8.streams;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapExample {

    private static List<String> printNames() {
        List<String> stringList = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        return stringList;
    }

    public static void main(String[] args) {
        System.out.println(printNames());
    }
}

package com.learnJava8.streamsTerminal;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsMappingExample {

    public static void main(String[] args) {
        List<String> students = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toList()));
        System.out.println(students);
    }
}

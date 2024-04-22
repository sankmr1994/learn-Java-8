package com.learnJava8.streams;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        Map<String, List<String>> stringListMap = StudentDataBase.getAllStudents().stream()
                .peek(student -> System.out.println("Student's before filter " + student))
                .filter(student -> student.getGradeLevel() >= 3)
                .peek(student -> System.out.println("Student's after filter grade level " + student))
                .filter(student -> student.getGpa() >= 3.9)
                .peek(student -> System.out.println("Student's after filter Gpa " + student))
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(stringListMap);


    }
}

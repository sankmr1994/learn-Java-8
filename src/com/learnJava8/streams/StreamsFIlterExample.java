package com.learnJava8.streams;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFIlterExample {
    private static List<Student> filterByGenderAndGpa() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equalsIgnoreCase("female"))
                .filter(student -> student.getGpa() >= 3.9)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        filterByGenderAndGpa().forEach(System.out::println);
    }
}

package com.learnJava8.streams;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    private static List<Student> sortByName() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    private static List<Student> sortByGpa() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    private static List<Student> sortByGpaDesc() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Sort by name: ");
        sortByName().forEach(System.out::println);
        System.out.println("Sort by gpa: ");
        sortByGpa().forEach(System.out::println);
        System.out.println("Sort by gpa desc: ");
        sortByGpaDesc().forEach(System.out::println);

    }
}

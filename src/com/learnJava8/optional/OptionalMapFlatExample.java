package com.learnJava8.optional;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatExample {

    private static void optionalFilter() {
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        optionalStudent.filter(student -> student.getGpa() > 3.5).ifPresent(System.out::println);
    }

    private static void optionalMap() {
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        optionalStudent.filter(student -> student.getGpa() > 3.5).map(Student::getName).ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
    }
}

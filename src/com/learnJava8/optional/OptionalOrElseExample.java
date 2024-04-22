package com.learnJava8.optional;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    private static String orElseExample() {
        Student student = StudentDataBase.studentSupplier.get();
        Student nullStudent = null;
        return Optional.ofNullable(nullStudent)
                .map(Student::getName)
                .orElse("Default");
    }

    private static String orElseGetExample() {
        Student student = StudentDataBase.studentSupplier.get();
        Student nullStudent = null;
        return Optional.ofNullable(nullStudent)
                .map(Student::getName)
                .orElseGet(() -> "Default");
    }

    private static String orElseThrowExample() {
        Student student = StudentDataBase.studentSupplier.get();
        Student nullStudent = null;
        return Optional.ofNullable(nullStudent)
                .map(Student::getName)
                .orElseThrow(() -> new RuntimeException("Name not found"));
    }

    public static void main(String[] args) {
        System.out.println(orElseExample());
        System.out.println(orElseGetExample());
        System.out.println(orElseThrowExample());
    }
}

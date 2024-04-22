package com.learnJava8.optional;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.Optional;

public class OptionalFlatMapExample {

    private static void withoutFlatMapExample() {
        Optional<Student> optionalStudent = StudentDataBase.getOptionalStudent();
        optionalStudent.filter(student -> student.getGpa() >= 3.5)
                .map(Student::getBike).ifPresent(System.out::println);
    }


    private static void flatMapExample() {
        Optional<Student> optionalStudent = StudentDataBase.getOptionalStudent();
        optionalStudent.filter(student -> student.getGpa() >= 3.5)
                .flatMap(Student::getBike).ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        withoutFlatMapExample();
        flatMapExample();
    }
}

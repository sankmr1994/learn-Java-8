package com.learnJava8.streams;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindFirstAnyExample {

    private static Optional<Student> findFirst() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa() >= 3.5)
                .findFirst();
    }

    private static Optional<Student> findAny() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa() >= 3.5)
                .findAny();
    }

    public static void main(String[] args) {
        Optional<Student> optionalFindFirst = findFirst();
        if (optionalFindFirst.isPresent()) {
            System.out.println("Find first result : " + optionalFindFirst.get());
        }

        Optional<Student> optionalFindAny = findAny();
        if (optionalFindAny.isPresent()) {
            System.out.println("Find any result : " + optionalFindAny.get());
        }
    }
}

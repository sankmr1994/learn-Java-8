package com.learnJava8.streams;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

public class StreamsMatchExample {

    private static boolean anyMatch() {
        return StudentDataBase.getAllStudents()
                .stream()
                .anyMatch(student -> student.getGpa() == 3.6);
    }

    private static boolean allMatch() {
        return StudentDataBase.getAllStudents()
                .stream()
                .allMatch(student -> student.getGpa() > 3.6);
    }

    private static boolean noneMatch() {
        return StudentDataBase.getAllStudents()
                .stream()
                .noneMatch(student -> student.getGpa() < 3.5);
    }

    public static void main(String[] args) {
        System.out.println("Any match : " + anyMatch());
        System.out.println("All match : " + allMatch());
        System.out.println("None match : " + noneMatch());

    }
}

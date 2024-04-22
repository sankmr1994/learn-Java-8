package com.learnJava8.streams;

import com.learnJava8.data.StudentDataBase;

import java.util.Optional;

public class StreamsMapReduceExample {

    private static Optional<Integer> totalNumberOfBooks() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGradeLevel() >= 3)
                .map(student -> student.getNoteBooks())
                .reduce((a, b) -> a + b);
    }

    public static void main(String[] args) {
        System.out.println(totalNumberOfBooks().get());
    }
}

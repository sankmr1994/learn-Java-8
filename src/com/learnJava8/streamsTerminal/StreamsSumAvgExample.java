package com.learnJava8.streamsTerminal;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsSumAvgExample {

    private static int sumOfNotebooks() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.summingInt(Student::getNoteBooks));
    }

    private static double avgOfNotebooks() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.averagingDouble(Student::getNoteBooks));
    }

    public static void main(String[] args) {
        System.out.println("Total number of notebook :" + sumOfNotebooks());
        System.out.println("Avg number of notebook :" + avgOfNotebooks());
    }
}

package com.learnJava8.streamsTerminal;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import javax.swing.text.html.Option;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsMinAndMaxByExample {

    private static Optional<Student> minByGpa() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
    }

    private static Optional<Student> maxByGpa() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
    }

    public static void main(String[] args) {
        System.out.println("min gpa student : " + minByGpa().get());
        System.out.println("max gpa student : " + maxByGpa().get());
    }
}

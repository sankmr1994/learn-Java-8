package com.learnJava8.streamsTerminal;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsJoiningExample {

    private static String joining() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    private static String joiningWithDelimiter() {
        return StudentDataBase.getAllStudents()
                .stream().map(Student::getName)
                .collect(Collectors.joining("-"));
    }

    private static String joiningWithDelimiterPrefixAndSuffix() {
        return StudentDataBase.getAllStudents()
                .stream().map(Student::getName)
                .collect(Collectors.joining("-", "{", "}"));
    }

    public static void main(String[] args) {
        System.out.println("Joining : " + joining());
        System.out.println("Joining with delimiter : " + joiningWithDelimiter());
        System.out.println("Joining with delimiter prefix and suffix : " + joiningWithDelimiterPrefixAndSuffix());

    }
}

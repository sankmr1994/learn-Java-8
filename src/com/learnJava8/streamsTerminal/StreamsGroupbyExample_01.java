package com.learnJava8.streamsTerminal;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsGroupbyExample_01 {

    private static Map<String, List<Student>> groupByGender() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender));
    }

    private static Map<String, List<Student>> customGroupByGender() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(student -> student.getGpa() > 3.5 ? "Outstanding" : "Average"));
    }

    public static void main(String[] args) {
        System.out.println("GroupBy Gender ");
        System.out.println(groupByGender());
        System.out.println("GroupBy Gpa ");
        System.out.println(customGroupByGender());
    }
}

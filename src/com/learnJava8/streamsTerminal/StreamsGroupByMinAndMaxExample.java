package com.learnJava8.streamsTerminal;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsGroupByMinAndMaxExample {

    private static Map<Integer, Optional<Student>> groupByMax() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.
                        groupingBy(Student::getGradeLevel,
                                Collectors.maxBy(Comparator.comparing(Student::getGpa))));
    }

    private static Map<Integer, Student> groupByMaxCollectAndThen() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
    }

    private static Map<Integer, Student> groupByMinCollectAndThen() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.collectingAndThen(
                                Collectors.minBy(Comparator.comparing(Student::getGpa)), Optional::get)));
    }

    public static void main(String[] args) {
        System.out.println("GroupBy max Gpa.");
        System.out.println(groupByMax());
        System.out.println("GroupBy max Gpa Using Collect And Then.");
        System.out.println(groupByMaxCollectAndThen());
        System.out.println("GroupBy min Gpa Using Collect And Then.");
        System.out.println(groupByMinCollectAndThen());
    }
}

package com.learnJava8.streamsTerminal;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsGroupbyExample_02 {

    private static Map<Integer, Map<String, List<Student>>> twoLevelGroupBy1() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.groupingBy(s -> s.getGpa() > 3.5 ? "Outstanding" : "Average")));
    }

    private static Map<String, Integer> groupByNameAndNotebooks() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName, Collectors.summingInt(Student::getNoteBooks)));
    }

    public static void main(String[] args) {
        System.out.println("Two Level groupBy : ");
        System.out.println(twoLevelGroupBy1());
        System.out.println("Two Level groupBy name and number of notebooks: ");
        System.out.println(groupByNameAndNotebooks());
    }
}

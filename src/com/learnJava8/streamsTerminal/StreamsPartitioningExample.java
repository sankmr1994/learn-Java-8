package com.learnJava8.streamsTerminal;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsPartitioningExample {

    private static Map<Boolean, List<Student>> partitionByGpa() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(student -> student.getGpa() > 4));
    }

    private static Map<Boolean, Set<Student>> partitionByGpaUsingSet() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(student -> student.getGpa() > 4, Collectors.toSet()));
    }


    public static void main(String[] args) {
        System.out.println("Partition by Gpa ");
        System.out.println(partitionByGpa());
        System.out.println("Partition by Gpa using Set");
        System.out.println(partitionByGpaUsingSet());
    }
}

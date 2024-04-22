package com.learnJava8.streams;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    public static void main(String[] args) {
        List<String> stringList = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(stringList);

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue());
        }

    }
}

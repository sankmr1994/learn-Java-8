package com.learnJava8.streams;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {
    public static int mutiplyByReduce(List<Integer> nums) {
        return nums.stream()
                .reduce(1, (a, b) -> a * b);
    }

    public static Optional<Student> getMaxGpaStudent() {
        return StudentDataBase.getAllStudents().stream()
                .reduce((student1, student2) -> student1.getGpa() > student2.getGpa() ? student1 : student2);
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        System.out.println(mutiplyByReduce(nums));

        Optional<Student> optionalStudent = getMaxGpaStudent();
        if (optionalStudent.isPresent()) {
            System.out.println(optionalStudent.get());
        }
    }
}

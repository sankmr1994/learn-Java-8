package com.learnJava8.optional;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.Optional;

public class OptionalPresentExample {

    private static Optional<Student> getStudent() {
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        return optionalStudent;
    }


    public static void main(String[] args) {
        Optional<Student> optionalStudent = getStudent();
        if (optionalStudent.isPresent()) {
            System.out.println(optionalStudent.get());
        }

        optionalStudent.ifPresent(student -> {
            Optional<String> studentName = Optional.ofNullable(student.getName());
            studentName.ifPresent(System.out::println);
        });
    }
}

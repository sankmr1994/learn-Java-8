package com.learnJava8.optional;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    private static Student getStudent() {
        Student student = StudentDataBase.studentSupplier.get();
        if (student != null) {
            return student;
        }
        return null;
    }

    private static Optional<String> getStudentOptional() {
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if (optionalStudent.isPresent()) {
            return optionalStudent.map(Student::getName);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        Student student = getStudent();
        if (student.getName() != null) {
            System.out.println("Student name is : " + student.getName());
        } else {
            System.out.println("Student name not found");
        }

        Optional<String> studentName = getStudentOptional();
        if (studentName.isPresent()) {
            System.out.println("Student name is : " + studentName.get());
        } else {
            System.out.println("Student name not found");
        }

    }
}

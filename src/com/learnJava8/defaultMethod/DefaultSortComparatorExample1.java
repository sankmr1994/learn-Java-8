package com.learnJava8.defaultMethod;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultSortComparatorExample1 {

    static Consumer<Student> studentConsumer = System.out::println;
    static Comparator<Student> studentNameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> studentGpaComparator = Comparator.comparing(Student::getGpa);

    static Comparator<Student> studentGradeComparator = Comparator.comparing(Student::getGradeLevel);

    static Comparator<Student> studentNullFirstComparator = Comparator.nullsFirst(studentNameComparator);

    private static void sortByStudentName(List<Student> students) {
        students.sort(studentNameComparator);
        System.out.println("After sorting by studentName.");
        students.forEach(studentConsumer);

    }

    private static void sortByStudentGpa(List<Student> students) {
        students.sort(studentGpaComparator);
        System.out.println("After sorting by studentGpa.");
        students.forEach(studentConsumer);
    }

    private static void sortByNameAndThenGpa(List<Student> students) {
        students.sort(studentGradeComparator.thenComparing(studentNameComparator));
        System.out.println("After sorting by studentGpa and then name.");
        students.forEach(studentConsumer);
    }

    private static void sortWithNulls(List<Student> students) {
        students.sort(studentNullFirstComparator);
        System.out.println("After sorting by student NULL first comparator.");
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println("Before sorting.");
        students.forEach(studentConsumer);
        sortByStudentName(students);
        sortByStudentGpa(students);
        sortByNameAndThenGpa(students);
        sortWithNulls(students);
    }
}

package com.learnJava8.dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ConvertingExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate : " + localDate);
        System.out.println("Add Time to Date : " + localDate.atTime(LocalTime.now()));

        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime : " + localTime);
        System.out.println("Add Date to Time : " + localTime.atDate(LocalDate.now()));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime : " + localDateTime);
        System.out.println("To LocalDate : " + localDateTime.toLocalDate());
        System.out.println("To LocalTime : " + localDateTime.toLocalTime());



    }
}

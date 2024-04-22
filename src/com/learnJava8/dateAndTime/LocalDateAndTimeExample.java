package com.learnJava8.dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateAndTimeExample {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local date and time : " + localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("Local date and time 1 : " + localDateTime1);

        //Getting values from LocalDateTime
        System.out.println("get Year : " + localDateTime.getYear());
        System.out.println("get month : " + localDateTime.getMonth());
        System.out.println("get day of month : " + localDateTime.getDayOfMonth());
        System.out.println("get hour : " + localDateTime.getHour());
        System.out.println("get minutes : " + localDateTime.getMinute());
        System.out.println("get seconds : " + localDateTime.getSecond());

        //Modify LocalDateTime
        System.out.println("plus minutes : " + localDateTime.plusMinutes(30));
        System.out.println("minus minutes : " + localDateTime.minusHours(3));
        System.out.println("With month : " + localDateTime.withMonth(12));
    }
}

package com.learnJava8.dateAndTime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("Local Time : " + localTime);

        LocalTime localTime1 = LocalTime.of(07, 30);
        System.out.println("Local Time 1 : " + localTime1);

        LocalTime localTime2 = LocalTime.of(07, 30, 50);
        System.out.println("Local Time 2 : " + localTime2);

        LocalTime localTime3 = LocalTime.of(07, 30, 50, 444);
        System.out.println("Local Time 3 : " + localTime3);

        //Getting values from localtime
        System.out.println("Get Hour : " + localTime.getHour());
        System.out.println("Get Minutes : " + localTime.getMinute());
        System.out.println("Get Seconds : " + localTime.getSecond());
        System.out.println("to Seconds : " + localTime.toSecondOfDay());

        //Modify localtime
        System.out.println("minus hour : " + localTime.minusHours(2));
        System.out.println("plus minutes : " + localTime.plusMinutes(32));
        System.out.println("Midnight  : " + localTime.with(LocalTime.MIDNIGHT));
    }
}

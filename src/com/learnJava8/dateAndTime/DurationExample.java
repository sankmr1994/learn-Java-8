package com.learnJava8.dateAndTime;

import java.time.Duration;
import java.time.LocalTime;

public class DurationExample {

    public static void main(String[] args) {
        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = localTime1.plusMinutes(75);

        Duration duration = Duration.between(localTime1,localTime2);
        System.out.println("Seconds : "+duration.toSeconds());
        System.out.println("Minutes : "+duration.toMinutes());
        System.out.println("hours : "+duration.toHours());
    }
}

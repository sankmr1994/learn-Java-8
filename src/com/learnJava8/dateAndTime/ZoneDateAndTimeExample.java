package com.learnJava8.dateAndTime;

import java.time.*;

public class ZoneDateAndTimeExample {

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("ZonedDateTime : " + zonedDateTime);
        System.out.println("Get offset : " + zonedDateTime.getOffset());
        System.out.println("Get Zone : " + zonedDateTime.getZone());

        System.out.println("Get Available zones : ");
        ZoneId.getAvailableZoneIds().forEach(System.out::println);

        System.out.println("UTC time : " + Instant.now());
        System.out.println("Local ZonedDateTime : " + zonedDateTime);
        System.out.println("Chicago CST : " + ZonedDateTime.now(ZoneId.of("America/Chicago")));

        LocalTime localTime = zonedDateTime.toLocalTime();
        LocalTime chicagoTime = ZonedDateTime.now(ZoneId.of("America/Chicago")).toLocalTime();
        Duration duration = Duration.between(chicagoTime, localTime);
        System.out.println("Hours : " + duration.toHours());

    }
}

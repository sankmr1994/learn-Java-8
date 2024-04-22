package com.learnJava8.dateAndTime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Local Date : " + date);

        LocalDate sameDate = LocalDate.now();

        LocalDate nextDay = date.plusDays(1);
        System.out.println("Next Local Date : " + nextDay);

        //Create LocalDate using of method
        LocalDate newDate = LocalDate.of(2024, 6, 5);
        System.out.println("Created new LocalDate : " + newDate);

        //Get Date of the year using days
        LocalDate dateOfYear = LocalDate.ofYearDay(1994, 300);
        System.out.println("Date of the year : " + dateOfYear);

        System.out.println("Get month : " + date.getMonth());
        System.out.println("Get month value : " + date.getMonthValue());
        System.out.println("Get Day of week : " + date.getDayOfWeek());
        System.out.println("Get Day of month : " + date.getDayOfMonth());
        System.out.println("Get Day of year : " + date.getDayOfYear());

        // date modification

        System.out.println("plusDays : " + date.plusDays(2));
        System.out.println("plusMonths : " + date.plusMonths(2));
        System.out.println("plusYears : " + date.plusYears(2));
        System.out.println("withYear : " + date.withYear(1994));
        System.out.println("with chronoField : " + date.with(ChronoField.YEAR, 1994));
        System.out.println("with TemporalAdjusters : " + date.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println("Chronounit minus : " + date.minus(1, ChronoUnit.YEARS));

        // Additional date support methods
        System.out.println("isLeap year : " + date.isLeapYear());
        System.out.println("isLeap year : " + LocalDate.ofYearDay(2023, 01).isLeapYear());
        System.out.println("isEqual : " + date.equals(nextDay));
        System.out.println("isEqual : " + date.equals(sameDate));

        System.out.println("isBefore : " + date.isBefore(nextDay));
        System.out.println("isBefore : " + date.isAfter(nextDay));

    }
}

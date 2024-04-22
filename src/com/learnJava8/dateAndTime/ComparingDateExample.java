package com.learnJava8.dateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDateExample {

    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.now();
        System.out.println("current date " + localDate1);
        LocalDate localDate2 = LocalDate.of(2024, 10, 20);
        System.out.println("Future date " + localDate2);

        Period period = localDate1.until(localDate2);
        System.out.println("getDays : " + period.getDays());
        System.out.println("getMonths : " + period.getMonths());
        System.out.println("getYears : " + period.getYears());

        Period period1 = Period.ofYears(10);
        System.out.println("No of days : " + period1.toTotalMonths());

        Period period2 = Period.between(localDate1, localDate2);
        System.out.println("Period : " + period2.getDays() + " " + period2.getMonths() + " " + period2.getYears());


    }
}

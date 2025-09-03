package edu.miu.badripaudel.test;

import java.time.LocalDate;
import java.time.Period;

public class DateDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today : " + today);

        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Tomorrow  " + tomorrow);
        System.out.println("Tomorrow  " + tomorrow.getDayOfYear());

        Period between = Period.between(LocalDate.now(), LocalDate.of(2000, 9, 3));
        System.out.println(between);
    }
}

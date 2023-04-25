package org.example;

import java.util.Scanner;

/**
 * Code adapted with little change from pseudocode in book "Software Testing" Chapter 2
 */
public class Main {
    public static void main(String[] args) {
        int day, month ,year;
        boolean c1, c2, c3;
        Scanner inputGetter = new Scanner(System.in);
        do {
            System.out.println("Enter today's date in the form MM DD YYYY.");
            month = inputGetter.nextInt();
            day = inputGetter.nextInt();
            year = inputGetter.nextInt();
            c1 = (1 <= day) && (day <= 31);
            c2 = (1 <= month) && (month <= 12);
            c3 = (1812 <= year) && (year <= 2012);
            if (!c1) {
                System.out.println("Value of day not in the range 1..31");
            }
            if (!c2) {
                System.out.println("Value of month not in the range 1..12");
            }
            if (!c3) {
                System.out.println("Value of year not in the range 1812..2012");
            }
        } while (!(c1 && c2 && c3));
        DateCalculator dc = new DateCalculator(day, month, year);
        System.out.println(dc.getTomorrowDate());
    }
}
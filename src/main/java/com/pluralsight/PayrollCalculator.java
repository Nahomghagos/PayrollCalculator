package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("what is your name ");
        String name = myScanner.nextLine();

        System.out.println("How many hours do you work? " );
        double hours = myScanner.nextDouble();
        System.out.println("what is your hourly pay? ");
        double payRate;
        payRate= myScanner.nextDouble();

        double grossRate;
        grossRate= hours * payRate;
        System.out.println("your pay rate is " + grossRate);






    }
}

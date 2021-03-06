/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 13
 *  Copyright 2021 Hunter Davis
 */

import java.util.Scanner;

public class Solution13 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

//        Pseudocode:
//        Read Principal
//        Read rate of interest
//        Read time in years
//        Read number of times interest is compounded per year
//        amount = principal * (1 + rateOfInterest/timesPerYear)^(timesPerYear * time)
//        Check if (amount % .01) > 0
//            Round up one cent
//        Print amount at the end of the investment

        int principal, time, timesPerYear;
        double rateOfInterest, amount;

        // Read principal
        System.out.print("Enter the principal: ");
        principal = in.nextInt();

        // Read rateOfInterest
        System.out.print("Enter the rate of interest: ");
        rateOfInterest = in.nextDouble();

        // Read time
        System.out.print("Enter the number of years: ");
        time = in.nextInt();

        // Read number of times interest is collected per year
        System.out.print("What is the number of times the interest is compounded per year? ");
        timesPerYear = in.nextInt();

        // Convert rateOfInterest from percentage to decimal
        rateOfInterest /= 100;

        // Calculate amount
        amount = principal * Math.pow((1 + rateOfInterest/timesPerYear),(timesPerYear * time));

        // Check if (amount % .01) > 0
        if ((amount % .01) > 0)
            amount += .01;

        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.",
                principal, rateOfInterest*100, time, timesPerYear, amount);

    }

}

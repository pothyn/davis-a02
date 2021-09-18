/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 12
 *  Copyright 2021 Hunter Davis
 */

import java.util.Scanner;

public class Solution12 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

//        Pseudocode:
//        Read Principal
//        Read rate of interest (in %) (double)
//        Divide RoI by 100
//        Read time (in years)
//        amount = principal * (1 + rateOfInterest * time)
//        Check if (amount % .01) > 0
//            Round up one cent
//        Print amount

        int principal, time;
        double rateOfInterest, amount;

        // Read principal
        System.out.print("Enter the principal: ");
        principal = in.nextInt();

        // Read RoI
        System.out.print("Enter the rate of interest: ");
        rateOfInterest = in.nextDouble();

        // Read time
        System.out.print("Enter the number of years: ");
        time = in.nextInt();

        // Change RoI from percentage to decimal
        rateOfInterest /= 100;

        // Calculate amount
        System.out.println("test1");
        amount = principal * (1.0 + rateOfInterest * time);

        // Check for remainder
        System.out.println("test2");
        if ((amount % .01) > 0)
            amount += .01;

        System.out.printf("After %d years at %.1f%%, the investment will be worth $%.0f.\n", time, rateOfInterest*100, amount);

    }

}

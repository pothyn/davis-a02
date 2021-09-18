/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 12
 *  Copyright 2021 Hunter Davis
 */

import java.util.Scanner;

public class Solution12 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

//        The formula for simple interest is A = P(1 + rt), where P is the principal amount,
//        r is the annual rate of interest, t is the number of years the amount is invested,
//        and A is the amount at the end of the investment.
//
//        Example Output
//        Enter the principal: 1500
//        Enter the rate of interest: 4.3
//        Enter the number of years: 4
//        After 4 years at 4.3%, the investment will be worth $1758.

//        Pseudocode:
//        Read Principal
//        Read rate of interest (in %) (double)
//        Divide RoI by 100
//        Read time (in years)
//        Amount = principle(1 + RoI * time)
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

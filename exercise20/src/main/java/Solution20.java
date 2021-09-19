/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 20
 *  Copyright 2021 Hunter Davis
 */

import java.util.Scanner;

public class Solution20 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

//        Pseudocode:
//        Read order amount
//        Read state
//        if state is Wisconsin
//            tax += .05
//            Read county
//            if county = Eau Claire
//                tax += .005
//            if county = Dunn
//                tax += .004
//            print tax
//        else if state is Illinois
//            tax += .08
//            print tax
//        total = tax * amount
//        print total


        // Init
        double amount, tax = 1, total;
        String state, county;

        // Read order amount
        System.out.print("What is the order amount? ");
        amount = in.nextDouble();

        // Read state
        System.out.print("What state do you live in? ");
        state = in.next();

        // Wisconsin check
        if (state.equalsIgnoreCase("Wisconsin")) {
            tax += .05;

            System.out.print("What county do you live in? ");
            county = in.next();

            if (county.equalsIgnoreCase("Eau Claire"))
                tax += .005;
            if (county.equalsIgnoreCase("Dunn"))
                tax += .004;
            System.out.printf("The tax is $%.2f.", tax);
        }

        // Illinois check
        else if(state.equalsIgnoreCase("Illinois")) {
            tax += .08;
            System.out.printf("The tax is $%.2f.", tax);
        }

        // Total Calculations and print
        total = tax * amount;
        System.out.printf("The total is $%.2f.",total);

    }

}

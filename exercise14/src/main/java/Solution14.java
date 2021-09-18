/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 12
 *  Copyright 2021 Hunter Davis
 */

import java.util.Scanner;

public class Solution14 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

//        Pseudocode:
//        Read order subtotal (double)
//        Read state (String)
//        double taxRate = 5.5 / 100
//
//        tax = subtotal * taxRate
//        total = subtotal + tax
//
//        Check if state = "WI"
//            print subtotal, tax
//        print total

        double subtotal, tax, taxRate = .055, total;
        String state;

        // Read order subtotal (double)
        System.out.print("What is the order amount? ");
        subtotal = in.nextDouble();

        // Read state (string)
        System.out.print("What is the state? ");
        state = in.next();

        // Total Calculations
        tax = subtotal * taxRate;
        total = subtotal + tax;

        // Check if state is "WI", if true, print subtotal and tax
        if(state.equals("WI"))
            System.out.printf("The subtotal is $%.2f.\nThe tax is $%.2f.\n", subtotal, tax);
        // Print total
        System.out.printf("The total is $%.2f.", total);

    }

}

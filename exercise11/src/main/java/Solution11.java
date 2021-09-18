/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 11
 *  Copyright 2021 Hunter Davis
 */

import java.util.Scanner;

public class Solution11 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

//        How many euros are you exchanging? 81
//        What is the exchange rate? 1.3751
//        81 euros at an exchange rate of 1.3751 is
//        111.39 U.S. dollars.

//        Pseudocode:
//        read in euroValue (double)
//        read in exchangeRate (double)
//        multiply euroValue by exchange rate and store in usValue
//        usValue % .01
//            if greater than 0, add .01 to usValue
//        print usValue

        double euroValue, usValue, exchangeRate;

        // Read euroValue
        System.out.print("How many euros are you exchanging? ");
        euroValue = in.nextDouble();

        // Read exchangeRate
        System.out.print("What is the exchange rate? ");
        exchangeRate = in.nextDouble();

        // Calculate usValue
        usValue = euroValue * exchangeRate;
        if(usValue % .01 > 0)
            usValue += .01;

        // Print
        System.out.printf("%.2f euros at an exchange rate of %.4f is %.2f U.S. dollars.", euroValue, exchangeRate, usValue);

    }

}

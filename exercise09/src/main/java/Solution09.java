/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 09
 *  Copyright 2021 Hunter Davis
 */

import java.util.Scanner;
import java.lang.Math;

public class Solution09 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

//        You will need to purchase 2 gallons of paint to cover 360 square feet.

//        Calculate gallons of paint needed to paint the ceiling of a room.
//        Prompt for the length and width, and assume one gallon covers 350 square feet.
//        Display the number of gallons needed to paint the ceiling as a whole number.

//        Pseudocode:
//        Prompt for square feet
//        Divide sqft by 350 (CAST AS DOUBLE) and put into gals
//        print ceiling(gals)

        int sqft;
        double gals;

        // Prompt user
        System.out.print("Enter space in square feet: ");
        sqft = in.nextInt();

        // Simple math
        gals = (double)sqft / 350;

        // Ceiling call
        gals = Math.ceil(gals);

        System.out.printf("You will need to purchase %.0f gallons of paint to cover %d square feet.\n", gals, sqft);
    }
}

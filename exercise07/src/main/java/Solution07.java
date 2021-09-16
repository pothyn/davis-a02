/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 07
 *  Copyright 2021 Hunter Davis
 */

import java.util.Scanner;

public class Solution07 {

    public static void main(String[] args) {
//        Request length of room
//        Request width of room
//        Read back dimensions
//        Calculate area = width * length
//        Print area in feet
//        Convert feet to meters using m2 = f2 × 0.09290304
//        Print area in meters

        final double conversionFactor = 0.09290304;
        int length, width, f2;
        double m2;
        Scanner in = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        length = in.nextInt();

        System.out.print("What is the width of the room in feet? ");
        width = in.nextInt();

        System.out.printf("You entered dimensions of %d feet by %d feet.\n", length, width);
        System.out.print("The area is\n");

        f2 = length * width;
        System.out.printf("%d square feet\n", f2);

        m2 = (double)(f2) * conversionFactor;

        System.out.printf("%.3f square meters\n", m2);

    }
    
}

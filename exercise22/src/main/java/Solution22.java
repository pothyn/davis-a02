/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 22
 *  Copyright 2021 Hunter Davis
 */

import java.util.Scanner;

public class Solution22 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

//        Write a program that asks for three numbers. Check first to see that all numbers are different.
//        If they’re not different, then exit the program. Otherwise, display the largest number of the three.

//        Enter the first number: 1
//        Enter the second number: 51
//        Enter the third number: 2
//        The largest number is 51.

//        Pseudocode:
//        Read three ints
//        if all numbers are equal
//            exit program
//        sort to find largest number
//        print largest number

        int a, b, c, largest;

        // First num
        System.out.print("Enter the first number: ");
        a = in.nextInt();

        // Second num
        System.out.print("Enter the second number: ");
        b = in.nextInt();

        // Third num
        System.out.print("Enter the third number: ");
        c = in.nextInt();

        // Multiple ways to interpret difference in all numbers (could also be if(a == b || b == c || a == c) )
        if(a == b && b == c)
            System.exit(1);

        // Sort
        if(a > b && a > c)
            largest = a;
        else if (b > c)
            largest = b;
        else
            largest = c;

        System.out.printf("The largest number is %d.", largest);

    }



}

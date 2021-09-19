/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 19
 *  Copyright 2021 Hunter Davis
 */

import java.util.Scanner;

public class Solution19 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

//        Pseudocode:
//        Read weight (make sure it is numeric)
//        Read height (make sure it is numeric)
//        Plug into bmi = (weight / (height × height)) * 703
//        if above 25
//            Print overweight
//        else if below 18.5
//            Print underweight
//        else
//            Print ideal weight range

        // Initialize
        int weight = -1, height = -1;
        double bmi;
        boolean isValid = false;

        // Weight
        while (!isValid) {
            System.out.print("How much do you weigh (lbs)? ");
            if (in.hasNextInt()) {
                weight = in.nextInt();
                if(weight > 0)
                    isValid = true;
            }
            in.nextLine();
        }
        isValid = false;

        // Height
        while (!isValid) {
            System.out.print("How tall are you (in)? ");
            if (in.hasNextInt()) {
                height = in.nextInt();
                if(height > 0)
                    isValid = true;
            }
            in.nextLine();
        }

        // BMI Calculation
        bmi = (weight / ((double)height * (double)height)) * 703.0;

        // Print
        System.out.printf("Your BMI is %.1f%n", bmi);
        if(bmi > 25)
            System.out.println("You are overweight. You should see a doctor.");
        else if(bmi < 18.5)
            System.out.println("You are underweight. You should see a doctor.");
        else
            System.out.println("You are within the ideal weight range.");

    }

}

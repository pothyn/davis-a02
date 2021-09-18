/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 17
 *  Copyright 2021 Hunter Davis
 */

import java.util.Scanner;

public class Solution17 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

//        Pseudocode:
//        Read in M/F
//        if (male == 1)
//            r = 0.73 for men
//        else
//            r = 0.66 for women
//        Read in alcohol consumption in oz
//        Read in weight in lbs
//        Read in hours since last drink
//        Calculate using BAC = (A × 5.14 / W × r) − .015 × H
//        Print BAC level
//        if above 0.08 print "it is not legal to drive"
//        else print "it is legal to drive"

        int ozOfAlcohol = -1, weight = -1, hoursSinceLastDrink = -1, gender = -1;
        double genderRate, bloodAlcoholContent;
        boolean isValid = false;

        // Read in M/F
        while (!isValid) {
            System.out.print("Enter a 1 is you are male or a 2 if you are female: ");

            // Check next int
            if (in.hasNextInt()) {
                gender = in.nextInt();
                if(gender == 1 || gender == 2)
                    isValid = true;
            }

            // Exclude the rest of the line
            in.nextLine();
        }
        isValid = false;

        // Check ozOfAlcohol
        while (!isValid) {
            System.out.print("How many ounces of alcohol did you have? ");
            if (in.hasNextInt()) {
                ozOfAlcohol = in.nextInt();
                if(ozOfAlcohol > 0)
                    isValid = true;
            }
            in.nextLine();
        }
        isValid = false;

        // Check weight
        while (!isValid) {
            System.out.print("What is your weight, in pounds? ");
            if (in.hasNextInt()) {
                weight = in.nextInt();
                if(weight > 0)
                    isValid = true;
            }
            in.nextLine();
        }
        isValid = false;

        // Check hoursSinceLastDrink
        while (!isValid) {
            System.out.print("How many hours has it been since your last drink? ");
            if (in.hasNextInt()) {
                hoursSinceLastDrink = in.nextInt();
                if(hoursSinceLastDrink > 0)
                    isValid = true;
            }
            in.nextLine();
        }

        // Check gender and set rate
        if(gender == 1)
            genderRate = .73;
        else
            genderRate = .66;

        // Use BAC equation given
        bloodAlcoholContent = (ozOfAlcohol * 5.14 / weight * genderRate) - (.015 * hoursSinceLastDrink);

        // Print BAC and if you can drive legally
        System.out.printf("Your BAC is %.6f\n", bloodAlcoholContent);
        System.out.println(bloodAlcoholContent > .08 ? "It is legal for you to drive." : "It is not legal for you to drive.");

    }

}

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 18
 *  Copyright 2021 Hunter Davis
 */

import java.util.Scanner;

public class Solution18 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

//        You’ll often need to determine which part of a program is run based on user input or other events.
//
//        Create a program that converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit.
//        Prompt for the starting temperature. The program should prompt for the type of conversion and then
//        perform the conversion.
//
//        The formulas are
//        C = (F − 32) × 5 / 9
//        and
//        F = (C × 9 / 5) + 32

//        Example Output
//        Press C to convert from Fahrenheit to Celsius.
//        Press F to convert from Celsius to Fahrenheit.
//        Your choice: C
//        Please enter the temperature in Fahrenheit: 32
//        The temperature in Celsius is 0.
//
//        Constraints
//        Ensure that you allow upper or lowercase values for C and F.
//        Use as few output statements as possible and avoid repeating output strings.

//        Pseudocode:
//        Prompt and read C or F value
//        Capitalize any values and match them to C or F
//        Check if == 'C'
//            ask to enter value in C
//        else
//            ask to enter value in F
//


        String celsiusOrFahrenheit = "", fullString = "Please enter the temperature in ", finalString = "The temperature in ";
        int givenTemp, returnedTemp;

        while(!celsiusOrFahrenheit.equalsIgnoreCase("C") && !celsiusOrFahrenheit.equalsIgnoreCase("F") ) {
            System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");
            celsiusOrFahrenheit = in.next();
            in.nextLine();
        }

        // Add on variable parts of the strings
        if(celsiusOrFahrenheit.equalsIgnoreCase("C")) {
            fullString += "Fahrenheit: ";
            finalString += "Celsius is ";
        }
        else {
            fullString += "Celsius: ";
            finalString += "Fahrenheit is ";
        }

        // Reading given temperature
        System.out.print(fullString);
        givenTemp = in.nextInt();

        // Calculations for temperature
        if(celsiusOrFahrenheit.equalsIgnoreCase("C"))
            returnedTemp = (givenTemp - 32) * 5 / 9;
        else
            returnedTemp = (givenTemp * 9 / 5) + 32;

        // The temperature in _____ is __.
        System.out.print(finalString + returnedTemp + ".");


    }

}

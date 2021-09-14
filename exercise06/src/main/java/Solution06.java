/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 06
 *  Copyright 2021 Hunter Davis
 */

import java.util.Scanner;

public class Solution06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Initialize age ints
        int currentAge, retirementAge, ageDifference;

        //Ask for current age
        System.out.print("What is your current age? ");
        currentAge = in.nextInt();

        //Ask retirement age
        System.out.print("At what age would you like to retire? ");
        retirementAge = in.nextInt();

        //Subtract retirement age from current age and print
        ageDifference = retirementAge - currentAge;
        System.out.printf("You have %d years left until you can retire.\n", ageDifference);

        //Use 2015 to calculate when you can retire
        System.out.printf("It's %d, so you can retire in %d.", 2015, 2015+ageDifference);
    }

}

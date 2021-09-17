/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 08
 *  Copyright 2021 Hunter Davis
 */

import java.util.Scanner;

public class Solution08 {

    public static void main(String[] args) {
//        Expected Result:
//        How many people? 8
//        How many pizzas do you have? 2
//        How many slices per pizza? 8
//        8 people with 2 pizzas (16 slices)
//        Each person gets 2 pieces of pizza.
//        There are 0 leftover pieces.

//        Pseudocode:
//        Ask how many people and store in peopleCount
//        Ask how many pizzas and store in pizzaCount
//        Ask how many slices per pizza and store in slicesPerPizza
//        Compute totalSlices = slicesPerPizza * pizzaCount
//        Compute slicesPerPerson = totalSlices / peopleCount
//        Compute  leftoverSlices = totalSlices % peopleCount
//        Print slicesPerPerson
//        Print leftoverSlices

        final Scanner in = new Scanner(System.in);
        int peopleCount, pizzaCount, slicesPerPizza, totalSlices, slicesPerPerson, leftoverSlices;

        // Ask how many people and store in peopleCount
        System.out.print("How many people? ");
        peopleCount = in.nextInt();

        // Ask how many pizzas and store in pizzaCount
        System.out.print("How many pizzas? ");
        pizzaCount = in.nextInt();

        // Ask how many slices per pizza and store in slicesPerPizza
        System.out.print("How many slices per pizza? ");
        slicesPerPizza = in.nextInt();

        // Calculations
        totalSlices = slicesPerPizza * pizzaCount;
        slicesPerPerson = totalSlices / peopleCount;
        leftoverSlices = totalSlices % peopleCount;

        // Print to terminal
        System.out.printf("%d people with %d pizzas (%d slices)\n", peopleCount, pizzaCount, totalSlices);
        System.out.printf("Each person gets %d pieces of pizza.\n", slicesPerPerson);
        System.out.printf("There are %d leftover pieces.\n", leftoverSlices);
    }

}

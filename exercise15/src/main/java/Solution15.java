/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 14
 *  Copyright 2021 Hunter Davis
 */

import java.util.Scanner;

public class Solution15 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

//        Pseudocode:
//        Take in username (Example code doesn't show it, so it doesnt seem relevant to the question)
//        Read password
//        Check if password matches the one commented
//        Print if you're in or not


//        CREDENTIALS:
//        Pass: abc$123

        String passGuess, password = "abc$123";


        // Example code doesn't show username, so it doesnt seem relevant to the question
        // hence, skip user and go to password
        System.out.print("What is the password? ");
        passGuess = in.next();

        // Check that password matches passGuess
        if(password.equals(passGuess))
            System.out.println("Welcome!");
        else
            System.out.println("I don't know you.");
    }

}

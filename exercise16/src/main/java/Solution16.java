/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 15
 *  Copyright 2021 Hunter Davis
 */

import java.util.Scanner;

public class Solution15 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

//        Pseudocode:
//        Prompt and read age
//        check if age >= 16
//            print "legally drive"
//        else
//            print "cannot legally drive"

        int age;

        // Read age
        System.out.print("What is your age? ");
        age = in.nextInt();

        // Check if >= 16
        System.out.print((age >= 16 ? "You are old enough to legally drive." :
                "You are not old enough to legally drive."));

    }

}

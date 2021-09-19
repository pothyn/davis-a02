/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 21
 *  Copyright 2021 Hunter Davis
 */

import java.util.Scanner;

public class Solution21 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

//        Please enter the number of the month: 3
//        The name of the month is March.

//        Use a switch or case statement for this program.
//        Use a single output statement for this program.

//        Pseudocode:
//        Read input for monthNumber
//        Translate into case 1-12
//        switch(monthNumber)
//            case 1: set monthStr = "January"
//            same for cases 2-12
//        print monthStr

        // Initialize
        int monthNumber;
        String monthStr;

        // monthNumber
        System.out.print("Please enter the number of the month: ");
        monthNumber = in.nextInt();

//        Translate into case 1-12
        switch(monthNumber) {
            case 1: monthStr = "The name of the month is January.";
                break;
            case 2: monthStr = "The name of the month is February.";
                break;
            case 3: monthStr = "The name of the month is March.";
                break;
            case 4: monthStr = "The name of the month is April.";
                break;
            case 5: monthStr = "The name of the month is May.";
                break;
            case 6: monthStr = "The name of the month is June.";
                break;
            case 7: monthStr = "The name of the month is July.";
                break;
            case 8: monthStr = "The name of the month is August.";
                break;
            case 9: monthStr = "The name of the month is September.";
                break;
            case 10: monthStr = "The name of the month is October.";
                break;
            case 11: monthStr = "The name of the month is November.";
                break;
            case 12: monthStr = "The name of the month is December.";
                break;
            default: monthStr = "invalid";
                break;
        }
        System.out.printf("%s", monthStr);
    }

}

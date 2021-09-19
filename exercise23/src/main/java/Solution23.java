/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 20
 *  Copyright 2021 Hunter Davis
 */

import java.util.Scanner;

public class Solution23 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

//        Pseudocode:
//        For each step
//            - take input
//            - check if input reads yes or no
//            - send to respective prompt

//        Prompt if car turns on
//            yes: Are the battery terminals corroded?
//                yes: clean terminals and try starting again
//                no: replace cables and try again
//            no: does the car make a clicking noise
//                yes: replace the battery
//                no: does the car crank up but fail to start?
//                    yes: check spark plug connections
//                    no: does the engine start and then die?
//                        yes: does your car have a fuel injection?
//                            yes: get it in for service
//                            no: check to ensure the choke is opening and closing
//                        no: this should not be possible

        String yesOrNo;

        System.out.println("Print \"yes\" or \"no\" to respond.");
        System.out.print("Is the car silent when you turn it on? ");
        yesOrNo = in.next();

        if(yesOrNo.equalsIgnoreCase("yes")) {
            System.out.print("Are the battery terminals corroded? ");
            yesOrNo = in.next();

            if (yesOrNo.equalsIgnoreCase("yes")) {
                System.out.print("Clean terminals and try starting again. ");
            }
            else if(yesOrNo.equalsIgnoreCase("no")) {
                System.out.print("Replace cables and try again.");
            }
        }

        else if(yesOrNo.equalsIgnoreCase("no")) {
            System.out.print("Does the car make a clicking noise? ");
            yesOrNo = in.next();

            if (yesOrNo.equalsIgnoreCase("yes")) {
                System.out.print("Replace the battery. ");
            }

            else if (yesOrNo.equalsIgnoreCase("no")) {
                System.out.print("Does the car crank up but fail to start? ");
                yesOrNo = in.next();

                if (yesOrNo.equalsIgnoreCase("yes")) {
                    System.out.print("Check spark plug connections. ");
                }

                else if (yesOrNo.equalsIgnoreCase("no")) {
                    System.out.print("Does the engine start and then die? ");
                    yesOrNo = in.next();

                    if (yesOrNo.equalsIgnoreCase("yes")) {
                        System.out.print("Does your car have a fuel injection? ");
                        yesOrNo = in.next();

                        if (yesOrNo.equalsIgnoreCase("yes")) {
                            System.out.print("Get it in for service. ");
                        }

                        else if (yesOrNo.equalsIgnoreCase("no")) {
                            System.out.print("Check to ensure the choke is opening and closing. ");
                        }
                    }

                    else if (yesOrNo.equalsIgnoreCase("no")) {
                        System.out.print("This should not be possible. ");
                    }
                }
            }
        }
    }
}

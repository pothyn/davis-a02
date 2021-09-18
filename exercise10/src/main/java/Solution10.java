/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 10
 *  Copyright 2021 Hunter Davis
 */

import java.util.Scanner;

public class Solution10 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

//        Create a simple self-checkout system. Prompt for the prices and quantities of three items.
//        Calculate the subtotal of the items. Then calculate the tax using a tax rate of 5.5%.
//        Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.

//        Enter the price of item 1: 25
//        Enter the quantity of item 1: 2
//        Enter the price of item 2: 10
//        Enter the quantity of item 2: 1
//        Enter the price of item 3: 4
//        Enter the quantity of item 3: 1
//        Subtotal: $64.00
//        Tax: $3.52
//        Total: $67.52

//        Prompt for the prices and quantities for three and store in respective variables
//        Multiply the prices by the quantities
//        Set subtotal = addition of all prices
//        Set tax = subtotal * taxRate (which is .055)
//        Set total = subtotal + tax
//        Print values

        int quantity1, quantity2, quantity3, itemNo = 0;
        double price1, price2, price3, subtotal, tax, taxRate = .055, total;

        Solution10 app = new Solution10();

        // Prompt and intake
        price1 = app.readPrice(++itemNo);
        quantity1 = app.readQuantity(itemNo);
        price2 = app.readPrice(++itemNo);
        quantity2 = app.readQuantity(itemNo);
        price3 = app.readPrice(++itemNo);
        quantity3 = app.readQuantity(itemNo);

        // Multiply the prices
        price1 *= quantity1;
        price2 *= quantity2;
        price3 *= quantity3;

        // Finals calculations
        subtotal = price1 + price2 + price3;
        tax = subtotal * taxRate;
        total = subtotal + tax;

        // Print statements
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total: $%.2f\n", total);
    }

    public double readPrice(int itemNo) {
        System.out.printf("Enter the price of item %d: ", itemNo);
        return in.nextDouble();
    }
    public int readQuantity(int itemNo) {
        System.out.printf("Enter the quantity of item %d: ", itemNo);
        return in.nextInt();
    }
}

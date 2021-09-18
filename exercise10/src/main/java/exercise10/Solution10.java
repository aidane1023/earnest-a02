/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 aidan earnest
 */

package exercise10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution10 {

    /*
        Print "Price of item 1:"
        'price1' = get int from user
        Print "Quantity of item 1:"
        'quantity1' = get int from user
        Print "Price of item 2:"
        'price2' = get int from user
        Print "Quantity of item 2:"
        'quantity2' = get int from user
        Print "Price of item 3:"
        'price3' = get int from user
        Print "Quantity of item 3:"
        'quantity3' = get int from user
        'subtotal' = 'price1' * 'quantity1' + 'price2' * 'quantity2' + 'price3' * 'quantity3'
        Print "Subtotal: $'subtotal'"
        'tax' = 'subtotal' * 0.055
        Print "Tax: $'tax'"
        'total' = 'subtotal' + 'tax'
        print "Total: $'total'"
     */

    double calcPerItem(int x) {
        //prompt for and get price split per item
        System.out.println("Price of item "+x+":");
        double p = in.nextDouble();
        System.out.println("Quantity of item "+x+":");
        int q = in.nextInt();

        return p * q;
    }
    void printResponse (subtotal, tax, total) {
        //return print statements
        System.out.println("Subtotal: $" + format.format(subtotal));
        System.out.println("Tax: $" + format.format(tax));
        System.out.println("Total: $" + format.format(total));
    }

    public static void main(String[] args) {
        Solution10 app = new Solution10();

        double split1 = app.calcPerItem(1);
        double split2 = app.calcPerItem(2);
        double split3 = app.calcPerItem(3);

        //calc all totals
        double subtotal = split1 + split2 + split3;
        double tax = subtotal * 0.055;
        double total = subtotal + tax;
        DecimalFormat format = new DecimalFormat("#.##");
        
        printReaponse(subtotal, tax, total);
    }
    private static final Scanner in = new Scanner(System.in);
}

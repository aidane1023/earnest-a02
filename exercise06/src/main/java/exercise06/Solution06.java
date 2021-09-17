/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 aidan earnest
 */

package exercise06;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Solution06 {

    /*
        'year' = calendar year
        Print "How old are you?"
        'age' = read int from user
        Print "How old do you want to be when you retire?"
        'retire' = read int from user
        'diff' = 'retire' - 'age'
        'retireYear' = 'year' + 'diff'
        Print "You have 'diff' years until retirement."
        Print "It's 'year', you can retire in 'retireYear'."
    */

    private static int readAgeFromUser(String prompt) {
        //get prompted age
        System.out.println(prompt);
        return in.nextInt();
    }
    double calcTimeLeft(int x, int y) {
        //get difference
        return y-x;
    }

    public static void main(String[] args) {
        Solution06 app = new Solution06();

        // get current year
        int year = Calendar.getInstance().get(Calendar.YEAR);

        int age = readAgeFromUser("How old are you?");
        int retire = readAgeFromUser("How old do you want to be when you retire?");

        double timeLeft = app.calcTimeLeft(age, retire);
        double retireYear = year + timeLeft;
        DecimalFormat format = new DecimalFormat("0.#");

        System.out.println("You have "+format.format(timeLeft) +" years until your desired retirement year.");
        System.out.println("It is "+year+", so that would be in "+format.format(retireYear)+".");
    }

    private static final Scanner in = new Scanner(System.in);
}

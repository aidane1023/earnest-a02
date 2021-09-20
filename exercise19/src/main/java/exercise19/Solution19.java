/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 aidan earnest
 */

package exercise19;

import java.util.Scanner;

public class Solution19 {
     /*
        Print "How tall are you in inches?"
        'height' = get int from user
        Print "What is your weight in pounds?"
        'weight' = get int from user
        'BMI' = (weight / (height * height)) * 703
        Print "Your BMI is 'BMI'."
        if 25 > BMI > 18.5
            Print "You are within the ideal weight range."
        else
            Print "You are underweight. You should see your doctor." if 'BMI' < 18.5
            Print "You are overweight. You should see your doctor." if 'BMI' > 25
      */

    private static int promptCount;
    private static int height;
    private static int weight;

    private static void tryCatch(String x) {
        int a = 0;
        try {
          a = Integer.parseInt(x);
        } catch (Exception e) {
            System.out.println("Numerical values only.");
            userInterface(promptCount);
        }
        if (promptCount == 0) {
            height = a;
        }
        if (promptCount == 1) {
            weight = a;
        }
        promptCount = promptCount + 1;
        userInterface(promptCount);
    }


    private static void userInterface(int promptCount) {
        String response;
        String prompt = "";

        //initial prompt
        if (promptCount == 0) {
             prompt = "What is your height in inches?";
        }
        //continuation through loops
        if (promptCount == 1) {
            prompt = "How much do you weigh in pounds?";
        }
        if (promptCount == 2) {
            double BMI = (weight / Math.pow(height, 2)) * 703;
            if (BMI > 18.5 && BMI < 25) {
                prompt = "Your BMI is " + BMI + ".\nYou are within the ideal weight range.";
            }
            else {
                prompt = (BMI > 25) ? "Your BMI is " + BMI + ".\nYou are overweight. You should see your doctor." : "Your BMI is "+BMI+"\nYou are underweight. You should see your doctor.";

            }
        }


        //single print statement
        System.out.println(prompt);

        if (promptCount < 2) {
            response = in.nextLine();
            //run try catch
            tryCatch(response);
        }
        if (promptCount == 2) {
            promptCount = promptCount + 1;
            userInterface(promptCount);
        }
    }

    public static void main(String[] args) {
        userInterface(promptCount);
    }
    private static final Scanner in = new Scanner(System.in);
}


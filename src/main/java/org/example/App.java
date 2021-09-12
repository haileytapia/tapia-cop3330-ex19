/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hailey Tapia
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        int enteredNum = 0;
        double height = 0.0, weight = 0.0, BMI = 0.0;
        Scanner input = new Scanner(System.in);

        while (enteredNum == 0)
        {
            System.out.print("What is your height, in inches? ");
            if (input.hasNextDouble())
            {
                height = input.nextDouble();
                enteredNum = 1;
            }
            else
                System.out.print("You must enter a number.\n");

            input.nextLine();
        }

        enteredNum = 0;

        while (enteredNum == 0)
        {
            System.out.print("What is your weight, in pounds? ");
            if (input.hasNextDouble())
            {
                weight = input.nextDouble();
                enteredNum = 1;
            }
            else
                System.out.print("You must enter a number.\n");

            input.nextLine();
        }

        BMI = (weight / (height * height)) * 703;

        if (BMI >= 18.5 && BMI <= 25)
            System.out.printf("Your BMI is %.1f.\nYou are within the ideal weight range.", BMI);
        else if (BMI < 18.5)
            System.out.printf("Your BMI is %.1f.\nYou are underweight. You should see your doctor.", BMI);
        else if (BMI > 25)
            System.out.printf("Your BMI is %.1f.\nYou are overweight. You should see your doctor.", BMI);
    }
}
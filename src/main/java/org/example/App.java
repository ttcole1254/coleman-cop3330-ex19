package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Tyler Coleman
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your height in inches. ");
        double height = in.nextDouble();
        System.out.println("Please enter your weight in pounds. ");
        double weight = in.nextDouble();
        double bmi = (weight / (height * height)) * 703;
        System.out.printf("Your BMI is %.02f", bmi);
        if (bmi >= 18.5 && bmi <= 25){
            System.out.println("You are within the ideal weight range.");
        }
        else {
            System.out.println("You are overweight. You should see your doctor.");
        }

    }
}

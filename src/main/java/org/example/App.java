package org.example;

/*
 *  UCF COP3330 Fall 2021 Exercise 17 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        double BAC, alcoholConsumed, weight;
        int gender, hours;

        Scanner scanner;

        do
        {
            System.out.println("Enter a 1 if you are a male or a 2 if you are female: ");
            try
            {
                scanner = new Scanner(System.in);
                gender = scanner.nextInt();
            }
            catch (Exception ex)
            {
                System.out.println("Invalid input");
                gender = -1;
            }
        }
        while (gender == -1);

        do
        {
            System.out.println("How many ounces of alcohol did you have? ");
            try
            {
                scanner = new Scanner(System.in);
                alcoholConsumed = scanner.nextDouble();
            }
            catch (Exception ex)
            {
                System.out.println("Invalid input");
                alcoholConsumed = -1;
            }
        }
        while (alcoholConsumed == -1);

        do
        {
            System.out.println("What is your weight, in pounds? ");
            try
            {
                scanner = new Scanner(System.in);
                weight = scanner.nextDouble();
            }
            catch (Exception ex)
            {
                System.out.println("Invalid input");
                weight = -1;
            }
        }
        while (weight == -1);

        do
        {
            System.out.println("How many hours has it been since your last drink? ");
            try
            {
                scanner = new Scanner(System.in);
                hours = scanner.nextInt();
            }
            catch (Exception ex)
            {
                System.out.println("Invalid input");
                hours = -1;
            }
        }
        while (hours == -1);

        double rate;
        if (gender == 1)
            rate = 0.73;
        else
            rate = 0.66;

        BAC = (alcoholConsumed * 5.14 / weight * rate) - 0.015 * hours;

        System.out.println("\nYour BAC is " + String.format("%.6f", BAC));
        System.out.println(BAC >= 0.08 ? "It is not legal for you to drive." : "It is legal for you to drive.");

    }
}
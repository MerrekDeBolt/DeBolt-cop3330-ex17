package org.example;

/*
 *  UCF COP3330 Fall 2021 Exercise 17 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        String input;
        double BAC, alcoholConsumed, weight;
        int gender, hours;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a 1 if you are a male or a 2 if you are female: ");
        input = scanner.nextLine();
        gender = Integer.parseInt(input);

        System.out.println("How many ounces of alcohol did you have? ");
        input = scanner.nextLine();
        alcoholConsumed = Double.parseDouble(input);

        System.out.println("What is your weight, in pounds? ");
        input = scanner.nextLine();
        weight = Double.parseDouble(input);

        System.out.println("How many hours has it been since your last drink? ");
        input = scanner.nextLine();
        hours = Integer.parseInt(input);

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
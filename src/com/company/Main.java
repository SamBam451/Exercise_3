package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        *Write a program that prompts a user to enter a temperature in Fahrenheit, converts it to Celsius,
        * and displays the Celsius temperature. Separate the code that collects user input,
        * the code that converts temperatures, and the code that displays the output into different methods.
        * The program should repeat until the user enters a value less than -460 (approximately absolute zero).
        */
        //Samuel Bovshovets
        System.out.println("Enter the Fahrenheit temp:");
        double Ftemp = input.nextDouble();
        double Ctemp = (((Ftemp - 32)*5)/9);
        System.out.println("Fahrenheit temp: " + Ftemp + "  Celsius temp: " + Ctemp);
        while(Ftemp > -460){
            System.out.println("Enter the Fahrenheit temp:");
            Ftemp = input.nextDouble();
            Ctemp = (((Ftemp - 32)*5)/9);
            System.out.println("Fahrenheit temp: " + Ftemp + "  Celsius temp: " + Ctemp);
        }
    }
}

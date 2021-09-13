package org.example;

/*
 *  UCF COP3330 Fall 2021 exercise 12 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.Scanner; //the scanner utility

public class App
{
    public static void main( String[] args ) //main function
    {
        Scanner userInput = new Scanner(System.in);

        //declare the variables that will be used in convertion
        Double principal;
        Double rate;
        int year;



        //scan all the numbers
        System.out.println("Enter the principal: " );
        principal = userInput.nextDouble(); //scan the input
        System.out.println("Enter the rate of interest: " );
        rate = userInput.nextDouble(); //scan the input
        System.out.println("Enter the number of years: " );
        year = userInput.nextInt(); //scan the input

        //math operations
        double ratePer = (rate / 100);
        double interest = principal*(1 + (ratePer * year));

        //round up the cents for final interest
        double interestR = Math.floor(interest*100)/100;

        //print output
        System.out.println("After " + year + " years at " + rate + "%, the " +
                "investment will be worth $" + interestR + ".");
    }
}
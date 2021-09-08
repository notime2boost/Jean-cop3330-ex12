package Ex12;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Jean
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principle: ");
        double principal = input.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double rate = input.nextDouble()/100;
        System.out.println("Enter the number of years: ");
        int years = input.nextInt();

        double worth = principal*(1+(rate*years));

        System.out.println("After "+years+" years at "+ rate + "%, the investment will be worth $"+worth);
    }
}

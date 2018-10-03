package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int number1 = 0;
        int number2 = 0;
        int total = 0;

        java.util.Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter and integer.");
        number1 = keyboard.nextInt();
        System.out.println("Please enter another integer");
        number2 = keyboard.nextInt();
        System.out.println((number1 + number2));
    }
}

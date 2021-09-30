package com.com.practice;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // Scanner class for ask user input
        Scanner input = new Scanner(System.in);

        // assign a variable to store inputed value, initialized as 0
        int value = 0;

        do {

            System.out.print("Enter a number : ");
            value = input.nextInt();

        } while (value != 5);

        System.out.println(" You got 5 ! Congratulations !");


    }
}

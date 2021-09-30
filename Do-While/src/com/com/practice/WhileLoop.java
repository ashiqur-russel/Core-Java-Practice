package com.com.practice;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int value = input.nextInt();

        while (value != 5) {
            System.out.print("Enter number again : ");
            value = input.nextInt();

        }

        input.close();


    }
}

package com.ashiq;

public class FirstLastDigitSum {
    public static void main(String[] args) {

        System.out.println(firstLastDigit(1234));
        System.out.println(firstLastDigit(1));
        System.out.println(firstLastDigit(0));
        System.out.println(firstLastDigit(-123));


    }

    // Method for sum of first and last digit of a number
    public static int firstLastDigit(int num) {

        // Return  -1 if number is negative

        if (num < 0) {
            return -1;
        }
        // Return 0 if number is 0
        if (num == 0) {
            return 0;
        }
        // add last digit of the number to the variable lastDigit
        int lastDigit = num % 10;

        // Declare & initialize a variable firstDigit to store first digit of the number
        int firstDigit = 0;

        while (num != 0 && num > 9) {
            firstDigit = num % 10;
            num = num / 10;
            continue;
        }

        return firstDigit + lastDigit;

    }
}

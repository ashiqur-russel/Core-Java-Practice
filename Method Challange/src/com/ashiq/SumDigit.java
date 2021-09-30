package com.ashiq;

public class SumDigit {
    public static void main(String[] args) {

        /**
         *
         * A program of sum of all the digit of number inputed
         */

        sumOfDigit(123);
        sumOfDigit(-123);
        sumOfDigit(19);
        sumOfDigit(0);

    }

    public static void sumOfDigit(int num) {

        int sum = 0;

        if (num > 0) {

            while (num >= 1) {

                int rem = num % 10;
                sum += rem;
                num = num / 10;

            }

        } else {
            sum = -1;

        }


        System.out.println(sum);


    }
}

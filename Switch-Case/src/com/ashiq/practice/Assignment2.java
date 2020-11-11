package com.ashiq.practice;

public class Assignment2 {
    public static void main(String[] args) {
        double result = calSum(4, 7);
        System.out.println(result);

    }

    public static double calSum(int n, double x) {


        double sum = 0;

        if (x == 0) {
            return 0;

        } else {
            for (int k = 0; k <= n; k++) {

                sum += (x + k) / x;

            }
            return 0.25 * sum;
        }
    }
}

package com.ashiq.practice;

public class Assignment2 {
    public static void main(String[] args) {
        double result = calSum(1, 1);
        double result1 = calcNested(3, 5, 6);
        System.out.println(result1);

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


    public static int calcNested(int n, int x, int y) {

        int result1 = 0;
        int productOfY = 1;
        for (int k = 0; k <= n; k++) {

            for (int j = 1; j <= k; j++) {
                productOfY *= (y * j);


            }
            result1 += x + productOfY;
            System.out.println(productOfY);
        }

        return result1;
    }
}

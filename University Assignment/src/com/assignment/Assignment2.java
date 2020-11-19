
/**
 * Assignment :2
 * course: Programming Basic Java
 * Winter 20/21
 */

package com.assignment;

public class Assignment2 {
    public static void main(String[] args) {


        double result = calSum(1, 1);
        double result1 = calcNested(3, 5, 6);
        System.out.println(result1);

    }



    /*
      Write a class "Assignment2" containing the function "static double calcSum(int n, double x)", which calculates the result of the following term:
      0.25*sum(x+k)/x,k=0ton
     Function should return 0 if the function is not calculatable.
     */

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

      /*
        Write a class "Assignment2" containing the function "static int calcNested(int n, int x, int y)", which calculates the result of the following term:
        2 + sum (x + (product y, j=0 to k)), k=0 to n
        Function should return -1 if the function is not calculatable
       */

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

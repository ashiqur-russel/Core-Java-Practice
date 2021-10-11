package com.udemy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x = 98;
        int y = 0;

        System.out.println(devideLBYL(x, y));
        System.out.println(devideEAFP(x, y));


        int a = getInt();
        System.out.println(a);

    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        int output = scanner.nextInt();
        return output;
    }

    private static int devideLBYL(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    private static int devideEAFP(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}

package com.udemy;

import java.util.Scanner;

public class HTest {
    public static void main(String[] args) {

        int x = getIntCheck();
        System.out.println("Number is : " + x);

    }

    // Check whether input is integer or char
    private static int getIntCheck() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Enter an Integer ");

        String input = s.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            return Integer.parseInt(input);
        }


        return 0;
    }

}



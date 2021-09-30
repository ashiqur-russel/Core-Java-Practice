package com.ashiq.practice;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter your password :");

        String text = input.nextLine();

        switch (text) {
            case "start":
                System.out.println(" Engine Started");
                break;

            case "stop":
                System.out.println("Engine turned off");
                break;

            default:
                System.out.println(" Wrong pass to start or stop the engine");
        }
    }
}

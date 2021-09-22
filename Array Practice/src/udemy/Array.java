package udemy;

import java.util.Scanner;

public class Array {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myInt = getIntergers(5);

        for (int i = 0; i < myInt.length; i++) {
            System.out.println(myInt[i]);
        }

    }

    public static int[] getIntergers(int number) {
        System.out.println("Enter " + number + " integers values.\r");

        int[] values = new int[number];


        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }


}

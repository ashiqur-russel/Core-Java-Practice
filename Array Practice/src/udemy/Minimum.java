package udemy;

import java.util.Scanner;

public class Minimum {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter Count:");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readInteger(count);

        for (int i = 0; i < returnedArray.length; i++) {
            System.out.print(returnedArray[i] + " ");
            System.out.println();
        }

        int returnMin = min(returnedArray);

        System.out.println("Min : " + returnMin);

    }

    private static int[] readInteger(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            int number = scanner.nextInt();
            array[i] = number;
        }
        return array;
    }


    private static int min(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];

            if (value < min) {
                min = value;
            }
        }
        return min;

    }

}

/**
 * Exercise 2 : Task 3
 * <p>
 * Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed.
 * The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat;
 * otherwise it should terminate.
 * <p>
 * Test Data
 * Enter the number 2
 * Do you want to continue y/n? y Enter the number 3
 * Do you want to continue y/n? n
 * <p>
 * Expected Output:
 * Sum of even numbers: 2 Sum of odd numbers: 3
 */

package Exercise2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        sumEvenOrOdd();
    }

    public static void sumEvenOrOdd() {

        int sumOfEven = 0;
        int sumOfOdd = 0;

        String isContinue = "";

        System.out.print("Enter the number : ");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        if (num % 2 == 0) {
            sumOfEven += num;
        } else {
            sumOfOdd += num;
        }


        do {
            System.out.print("Do you want to add number again? y/n --> ");
            input = new Scanner(System.in);

            isContinue = input.nextLine();
            if (isContinue.equals("n")) {
                break;
            } else {
                System.out.print("Enter Number again :");

                num = input.nextInt();

                if (num % 2 == 0) {
                    sumOfEven += num;
                } else {
                    sumOfOdd += num;
                }

            }
        } while (isContinue.equals("y"));

        System.out.println("Sum of Odd numbers : " + sumOfOdd);

        System.out.println("Sum of Even numbers : " + sumOfEven);

    }


}

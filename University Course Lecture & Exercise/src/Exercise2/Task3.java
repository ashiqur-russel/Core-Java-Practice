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

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num1 = input.nextInt();
        System.out.println("Do you wish to continue y/n");

        String wish = input.next();

        if (wish.equals("y")) {
            System.out.println("Enter Number again");
            int num2 = input.nextInt();


        }

    }


}

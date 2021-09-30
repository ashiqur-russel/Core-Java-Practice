package Array;

import java.util.Scanner;

public class Array1D {

    /**
     * Task
     * <p>
     * The code in your editor does the following:
     * <p>
     * Reads an integer from stdin and saves it to a variable, , denoting some number of integers.
     * Reads  integers corresponding to  from stdin and saves each integer  to a variable, .
     * Attempts to print each element of an array of integers named .
     * Write the following code in the unlocked portion of your editor:
     * <p>
     * Create an array, , capable of holding  integers.
     * Modify the code in the loop so that it saves each sequential value to its corresponding location in the array. For example, the first value must be stored in , the second value must be stored in , and so on.
     * Good luck!
     * <p>
     * Input Format
     * <p>
     * The first line contains a single integer, , denoting the size of the array.
     * Each line  of the  subsequent lines contains a single integer denoting the value of element .
     * <p>
     * Output Format
     * <p>
     * You are not responsible for printing any output to stdout. Locked code in the editor loops through array  and prints each sequential element on a new line.
     * <p>
     * Sample Input
     * <p>
     * 5
     * 10
     * 20
     * 30
     * 40
     * 50
     * <p>
     * Sample Output
     * <p>
     * 10
     * 20
     * 30
     * 40
     * 50
     * <p>
     * Explanation
     * <p>
     * When we save each integer to its corresponding index in , we get . The locked code prints each array element on a new line from left to right.
     */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }


}

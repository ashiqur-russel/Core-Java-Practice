package jaggedarray;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        int n, m;
        Scanner input = new Scanner(System.in);
        System.out.println();

        m = input.nextInt();
        n = input.nextInt();
        int[][] array = new int[m][n];
        System.out.print("Input the matrix  elements :\n  ");
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++)
                array[i][j] = input.nextInt();
        }

        System.out.println();
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        minimumOfColumn(array, n, m);
    }

    //Method to find minimum column

    public static void minimumOfColumn(int array[][], int row, int col) {
        int i, j;
        int sum = 0;

        for (i = 0; i < col; i++) {
            int min = array[0][i];
            for (j = 1; j < row; j++) {
                if (array[j][i] < min) {
                    min = array[j][i];
                }
                sum += min;

            }
            System.out.println(min);
        }
        System.out.println("Sum of all Min num is : " + sum);


    }
}

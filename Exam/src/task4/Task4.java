package task4;


import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of n = ");
        int n = input.nextInt();
        System.out.print("Enter value of m = ");
        int m = input.nextInt();
        System.out.println("Number of ways = " + countWays(n, m));
    }

    static int countWays(int n, int m) {
        int count[] = new int[n + 1];
        count[0] = 0;

        int i = 1;

        while (i <= n) {
            {
                if (i > m)
                    count[i] = count[i - 1] + count[i - m];
                else if (i < m || i == 1)
                    count[i] = 1;
                else
                    count[i] = 2;
                i++;
            }
        }
        return count[n];
    }


}



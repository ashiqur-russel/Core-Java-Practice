package Assignment;

public class Assignment2 {

    public static void main(String[] args) {
        double result = calSum(5, 8);
        double result1 = calcNested(3, 5, 6);
        System.out.println(result);
        System.out.println(result1);


    }

    // Task 1 (Complete)

    public static double calSum(int n, double x) {


        double sum = 0;

        // Return 0 , if function is not calculatable ( when  x = 0 )

        if (x == 0) {
            return 0;

        } else {
            for (int k = 0; k <= n; k++) {

                sum += (x + k) / x;

            }
            return 0.25 * sum;
        }
    }

    // Task 2

    public static int calcNested(int n, int x, int y) {

        int result1 = 0;
        int productOfY = 1;
        for (int k = 0; k <= n; k++) {

            for (int j = 1; j <= k; j++) {
                productOfY *= y;

            }
            result1 += x + productOfY;
            productOfY = 1;
        }

        return 2 + result1;
    }
}

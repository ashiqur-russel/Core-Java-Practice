package self;

public class Test {
    public static void main(String[] args) {

        int[][] arr = {{2, 3, 5}, {4, 2, 5}, {9, 2, 5,}};

        // print the matrix of array

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //find max col

        int max_col = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i].length > max_col)
                    max_col = arr[i].length;
            }
            System.out.println();
        }
        System.out.println("Max Col: " + max_col);
        System.out.println();


        // find max value from each row and sum of all each max value
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int max = arr[0][i];

            for (int j = 0; j < arr.length; j++) {

                if (arr[j][i] > max) {
                    max = arr[j][i];
                }
            }
            sum += max;
            System.out.println("Max: " + max);
        }
        System.out.println();
        System.out.println("Sum of all max form each column = " + sum);
    }
}

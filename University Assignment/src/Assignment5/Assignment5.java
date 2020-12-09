package Assignment5;

public class Assignment5 {
    // main function of class
    public static void main(String[] args) {

        int A[][] = {{1, 2}, {3, 4}};
        int B[][] = {{1, 1}, {1, 1}};

        int row1 = A.length;
        int col1 = A[0].length;

        int row2 = B.length;
        int col2 = B[0].length;
        int[][] result = multiplyMatrix(row1, col1, A, row2, col2, B);


        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {

                System.out.print(result[i][j] + " ");

            }
            System.out.println();

        }

    }

    // task 1

    public static int[][] multiplyMatrix(int row1, int col1, int A[][], int row2, int col2, int B[][]) {

        int[][] productOfTwoMatrix = {{0}, {0}};

        if (col1 != row2) {

            return productOfTwoMatrix;
        }

        productOfTwoMatrix = new int[row1][col2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    productOfTwoMatrix[i][j] += A[i][k] * B[k][j];
                }
            }

        }

        return productOfTwoMatrix;

    }
}

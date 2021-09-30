public class Task2a {

    public static int productDiagonals(int[][] array, int length) {

        int product = 1;

        for (int i = 0; i < length; i++) {
            product = product * array[i][i];
        }
        for (int i = 0; i < length; i++) {
            product = product * array[(length - 1) - i][i];
        }

        if (length % 2 == 1) {
            product = product / array[length / 2][length / 2];
        }
        return product;
    }

    public static void main(String[] args) {

        {
            int[][] x = {{1, 2, 3}, {5, 4, 7}, {3, 7, 2}};
            System.out.println(Task2a.productDiagonals(x, 3));
        }
        {
            int[][] x = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 7, 4, 2}, {2, 2, 2, 1}};
            System.out.println(Task2a.productDiagonals(x, 4));
        }
        {
            int[][] x = {{1, 2, 3, 4, 5}, {5, 6, 7, 8, 6}, {9, 7, 4, 2, 7}, {2, 2, 2, 1, 8}, {2, 4, 2, 1, 1}};
            System.out.println(Task2a.productDiagonals(x, 5));
        }

    }

}

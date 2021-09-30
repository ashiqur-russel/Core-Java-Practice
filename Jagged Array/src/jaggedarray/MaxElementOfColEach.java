package jaggedarray;

public class MaxElementOfColEach {
    // Function to find the maximum
    // element of each column.
    public static void largestInColumn(int col, int[][] arr) {

        for (int i = 0; i < col; i++) {

            // Initialize max to 0 at beginning
            // of finding max element of each column
            int maxm = arr[0][0];
            for (int j = 1; j < arr[i].length; j++)
                if (arr[j][i] > maxm)
                    maxm = arr[j][i];

            System.out.println(maxm);
        }
    }

    // Driver code
    public static void main(String[] args) {
        int[][] arr = new int[][]{{3, 4, 1},
                {1, 4, 9},
                {76, 34, 21},
                {2, 1, 4, 4}};

        //find the column length
        int max_col = arr.length;
        // Calling the function
        largestInColumn(max_col, arr);
    }

}

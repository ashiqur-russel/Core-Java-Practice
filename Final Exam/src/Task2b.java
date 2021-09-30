public class Task2b {

    /**
     * Main Function
     *
     * @param args
     */

    public static void main(String[] args) {

        {
            int[][] x = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
            Task2b.search(x, 29);
        }
        {
            int[][] x = {{10, 20, 30, 40, 50}, {15, 25, 35, 45, 52}, {27, 29, 37, 48, 55}, {32, 33, 39, 50, 56}, {32, 33, 39, 50, 60}};
            Task2b.search(x, 100);
        }
    }

    /**
     * @param array to check the array
     * @param x     element that needed to check
     */

    public static void search(int[][] array, int x) {

        int jStartingValue = 0;
        int jMaxValue = array.length;

        for (int i = 0; i < array.length; i++) {

            for (int j = jStartingValue; j < jMaxValue; ) {
                if (array[i][j] == x) {
                    System.out.println("Found at (" + i + ", " + j + ")");
                    return;
                }
                if (array[i][j] > x) {
                    if (j == 0) {
                        System.out.println("Element not found");
                        return;
                    }
                    jStartingValue = j - 1;
                    jMaxValue = j;
                }
                j++;
            }
        }
        System.out.println("Element " + x + " not found");
    }
}



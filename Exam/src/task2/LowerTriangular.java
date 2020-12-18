package task2;

public class LowerTriangular {

    public static void main(String[] args) {
        int[][] M = {{1, 0, 0, 0, 0}, {0, 2, 0, 0, 0}, {0, 0, 3, 0, 0}, {0, 0, 0, 2, 0}, {0, 0, 0, 0, 4}};
        //System.out.println(lowerTriangular(M));
        //System.out.println(checkDiagonal(M));

    }


    public static Boolean lowerTriangular(int M[][]) {
        for (int i = 0; i < M.length; i++)
            for (int j = i + 1; j < M.length; j++) {
                if (M[i][j] != 0) {
                    return false;
                }
            }
        return true;
    }
}

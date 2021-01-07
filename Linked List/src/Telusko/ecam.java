package Telusko;

public class ecam {


    public static void main(String[] args) {
        int[][] M = {{1, 0, 0, 0, 0}, {0, 2, 0, 0, 0}, {0, 0, 3, 0, 0}, {0, 0, 0, 2, 0}, {0, 0, 0, 0, 4}};
        //System.out.println(lowerTriangular(M));
        //System.out.println(checkDiagonal(M));

    }


    public static Boolean checkDiagonal(int M[][]) {
        for (int i = 0; i < M.length; i++)
            for (int j = 0; j < M.length; j++) {
                if ((i != j) && M[i][j] != 0) {
                    return false;
                }
            }
        return true;
    }
}



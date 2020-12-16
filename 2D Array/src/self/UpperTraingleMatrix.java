package self;

public class UpperTraingleMatrix {

    public static void main(String[] args) {
        // driver function
        int[][] mat = {{1, 3, 5, 3},
                {0, 4, 6, 2},
                {0, 0, 2, 5},
                {0, 0, 0, 6}};

        System.out.println(isUpperTriangularMatrix(mat));
    }

    public static Boolean isUpperTriangularMatrix(int mat[][]) {
        for (int i = 1; i < mat.length; i++)
            for (int j = 0; j < i; j++)
                if (mat[i][j] != 0)
                    return false;
        return true;
    }

}

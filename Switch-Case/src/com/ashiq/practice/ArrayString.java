package com.ashiq.practice;

public class ArrayString {
    public static void main(String[] args) {


        int[][] grid = {
                {3, 5, 6},
                {2, 4},
                {1, 2, 3, 4}

        };


        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + "\t");

            }
            System.out.println();
        }


    }
}

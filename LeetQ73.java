package com.company;

import java.util.Arrays;

public class LeetQ73 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}};
        check(matrix);
    }

    static void check(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    ans1(i, j, matrix);
                }
                else{
                    break;
                }
            }
        }
    }

    static int[][] ans1(int i, int j, int[][] matrix) {
        int[][] ans = new int[matrix.length][];
        for (int a = 0; a < matrix.length; a++) {
            for (int b = 0; b < matrix[b].length; b++) {
                if (a==i||b==j) {
                    ans[i][b] = 0;
                    ans[a][j] = 0;
                }
                else{
                    ans[a][b]=1;
            }
        }
    }
        return ans;
}


}

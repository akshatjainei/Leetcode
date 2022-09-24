package com.company;

public class LeetQ1572 {
    public static void main(String[] args) {
        int [][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(mat));
    }
    static int diagonalSum(int[][] mat) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < mat.length; i++) {
            if (i == mat.length - i - 1) {
                sum1 += mat[i][i];
                sum2 += 0;
            } else {
                sum1 += mat[i][i];
                sum2 += mat[i][mat.length - i - 1];
            }
        }
        return sum2 + sum1;
    }
}

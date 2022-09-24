package com.company;

import java.util.Arrays;

public class LeetQ566 {
    public static void main(String[] args) {
        int [][] mat = {{1,2},{3,4}};
        int r=1  ;
        int c=4;
        System.out.println(Arrays.deepToString(matrixReshape(mat, r, c)));
    }
    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int [][] ans = new int [r][c];
        int [] clone = new int [r*c];
        int ct=0;

        for (int[] ints : mat) {
            for (int j = 0; j < mat[0].length; j++) {
                clone[ct] = ints[j];
                ct++;
            }
        }
        int count=0;
        for(int a =0 ; a < r ; a++){
            for(int b =0 ; b < c ; b++){
                ans[a][b]=clone[count];
                count++;
            }
        }
        return ans;
    }
}

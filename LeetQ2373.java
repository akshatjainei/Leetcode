package com.company;

import java.util.Arrays;

public class LeetQ2373 {
    public static void main(String[] args) {
        int [][] grid = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        System.out.println(Arrays.toString(largestLocal(grid)));
    }
    static  int[][] largestLocal(int[][] grid) {
        int n = grid.length , max =0 , k=0 , a=0;
        int [][] ans = new int [n-2][n-2];
        for(int i =0 ; i <=ans.length ; i++){
            for(int j = 0 ; j <=ans.length ; j++){
                ans[i][j]=maxfun(a,k, grid);
                if(a<(n-3)){
                    a++;
                }
                if(a==n-3){
                    a=0;
                    k++;
                }
            }
        }
        return ans;
    }
    static int maxfun(int a, int k , int [][] grid){
        int max = Integer.MIN_VALUE;
        for(int i = k; i < k+3; i++){
            for(int j =a; j <a+3 ; j++){
                max=Math.max(max,grid[i][j]);
            }
        }
        return max;
    }
}

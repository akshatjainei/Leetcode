package com.company;

import java.util.Arrays;

public class LeeetQ1861 {
    public static void main(String[] args) {
        char [][]box = {{'#','.','#'}};
        System.out.println(Arrays.toString(rotateTheBox(box)));
    }
    static char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;
        char [][] ans = new char [n][m];
        for(int i=0 ; i < n ; i++){
            for (int j = 0; j < m; j++) {
                ans[m][n]=box[m][n];
            }
        }
        return ans;
        }
}

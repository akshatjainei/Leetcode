package com.company;

import java.util.ArrayList;

public class LeetQ11 {
    public static void main(String[] args) {
        int [] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(check(arr));

    }
    static int check (int [] height){
        int val =0;
        int i = 0;
        int j = height.length-1;
        while (i<j){
            int a = Math.abs(Math.min(height[i],height[j])*Math.abs(j-i));
            val=Math.max(val,a);
            if (height[i]<height[j]){
                i++;
            }
            else {
                j--;
            }
        }
        return val;
    }
}

package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetQ338 {
    public static void main(String[] args) {
        int n =5;
        System.out.println(Arrays.toString(countBits(n)));
    }
    static int[] countBits(int n) {
            int [] ans = new int [n+1];
            ans[0]=0;
            for(int i = 1; i <= n ; i++){
                int count =0;
                int num = i;
                while(num!=0){
                    num=num&(num-1);
                    count++;
                }
                ans[i]=count;
            }
            return ans;
        }
}

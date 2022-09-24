package com.company;

import java.util.Arrays;

public class LeetQ1860 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(memLeak(2,2)));

    }
    static int[] memLeak(int m1, int m2) {
        int[] ans = new int [3];
        int i =1;

        while(m1-i>=0 || m2-i>=0){
            if(m1-i>=0 && m1>=m2 ) m1-=i;
            else m2-=i;
            i++;
        }
        ans[0]=i;
        ans[1]=m1;
        ans[2]=m2;
        return ans;
    }
}

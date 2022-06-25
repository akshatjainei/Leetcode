package com.company;

import java.util.Arrays;

public class LeetQ66 {
    public static void main(String[] args) {
        int[] digits = {1, 2, 0, 0};
        int k = 32;
        System.out.println(Arrays.toString(check(digits,k)));
    }

    static int [] check(int[] digits , int k ) {
        int digit = digits.length;
        int i = 0;
        int num=0;
        // converting array into a number
        while (i < digit) {
            num += (digits[i])*Math.pow(10,digit-i-1);
            i++;
        }
        int newnum = num+k;
        int dig = (int) Math.log10(newnum);
        for(int j = 0 ; j<dig ; j++){
            newnum%=Math.pow(10,dig-i-1);
            int [] arr = new int[] {newnum};
        }
        return new int[] {-1,-1};
    }
}


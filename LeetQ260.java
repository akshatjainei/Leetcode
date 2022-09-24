package com.company;

import java.util.Arrays;

public class LeetQ260 {
    public static void main(String[] args) {
        int[] arr = {3,5,1,1,2,2};
        System.out.println(Arrays.toString(singleNumber(arr)));
    }
    static int[] singleNumber(int[] nums) {
        if (nums.length == 2) return nums;
        int[] ans = new int[2];
        int c = 0, k = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int xor = nums[i] ^ nums[j];
                if (i != j && xor != 0) {
                    c++;
                }
            }
            if (c == nums.length - 1) {
                ans[k] = nums[i];
                k++;
            }
            c = 0;
        }
        return ans;
    }
}

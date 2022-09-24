package com.company;

import java.util.Arrays;

public class LeetQ1877 {
    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 3};
        System.out.println(minPairSum(nums));
    }

    static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int n = nums.length ;
        int j = n - 1, max = 0;
        while (i < j) {
            max = Math.max((nums[i] + nums[j]), max);
            i++;
            j--;
        }
        return max;
    }
}

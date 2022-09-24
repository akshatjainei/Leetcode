package com.company;

import java.util.Arrays;

public class LeetQ2295 {
    public static void main(String[] args) {
        int [] nums = {1,2,4,6};
        int [][] operations = {{1,3},{4,7},{6,1}};
        System.out.println(Arrays.toString(arrayChange(nums,operations)));
    }
    static int[] arrayChange(int[] nums, int[][] operations) {
        Arrays.sort(nums);
        int i = 0;
        while (i < operations.length) {
            int s = 0, e = nums.length - 1;
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (nums[mid] > operations[i][0]) {
                    e = mid - 1;
                } else if (nums[mid] < operations[i][0]) {
                    s = mid + 1;
                } else {
                    nums[mid] = operations[i][1];
                }
            }
            i++;
        }
        return nums;
    }
}

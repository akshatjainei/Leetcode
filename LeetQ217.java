package com.company;

import java.util.Arrays;

public class LeetQ217 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }
    static int[] sort (int [] nums) {
        int n = nums.length;
        for (int i = 1; i < n; ++i) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = key;
        }
        return nums;
    }

    static boolean containsDuplicate(int[] nums){
        sort(nums);
        int [] arr = sort(nums);
        for (int i =1 ; i < arr.length ; i++){
            if (arr[i-1]==arr[i]){
                return true;
            }
        }
        return false;
    }
}

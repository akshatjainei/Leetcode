package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class LeetQ645 {
    public static void main(String[] args) {
        int [] nums = {1,1};
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
        if (i + 1 != nums[i]) {
            int ans =0;
            ans+=(i + 1);
            System.out.println(Arrays.toString(new int[]{nums[i],ans}));
        }
    }
}
    private static void sort(int[] nums) {
        int i = 0;
        int correct;
        while(i < nums.length) {
            correct = nums[i] - 1;

            if (correct < nums.length && nums[correct] != nums[i]) {
                swap(nums, correct, i);
            }
            else {
                i++;
            }
        }
    }

    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

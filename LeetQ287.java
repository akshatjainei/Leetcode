package com.company;

import java.util.Arrays;

public class LeetQ287 {
    public static void main(String[] args) {
        int [] nums = {1,3,4,2,2};
        sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(duplicate(nums));

    }
    static int duplicate (int [] nums){
        int [] arr = nums.clone();
        for (int a = 0 ; a < arr.length ; a++){
            if (arr[a]!=a+1){
                return arr[a];
            }
        }
        return -1;
    }
    static void sort (int [] nums){
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
    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

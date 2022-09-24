package com.company;

import java.util.Arrays;

public class LeetContest6132 {
    public static void main(String[] args) {
        int [] arr ={0};
        System.out.println(check1(arr));

    }
    static int  check1(int [] nums){
        int count =0;
        for(int j = 0 ; j < nums.length ; j++){
            if(nums[j]!=0){
                count++;
                check(nums);
            }
        }
        return count;
    }

    static void check(int[] nums) {
        int min = min(nums);
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]!=0){
                nums[i]=nums[i]-min;
            }
        }
    }

    static int min(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0 ; i<nums.length ; i++){
            if(nums[i]!=0){
                return nums[i];
            }
        }
        return 0;
    }
}

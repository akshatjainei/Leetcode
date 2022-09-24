package com.company;

import java.util.Arrays;

public class LeetQ27 {
    public static void main(String[] args) {
        int [] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeEl(nums , val));
        System.out.println(Arrays.toString(remove(nums, val)));
    }
    static int removeEl(int [] nums , int val){
        int count = 0 ;
        for (int i = 0 ; i<nums.length ; i++){
            if (nums[i]==val){
                count++;
            }
        }
        return nums.length-count;
    }
    static int [] remove (int [] nums , int  val){
        Arrays.sort(nums);
        int [] arr = Arrays.copyOf(nums,5);
        return arr;
    }
}

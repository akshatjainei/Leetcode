package com.company;

import java.util.Arrays;

public class LeetQ908 {
    public static void main(String[] args) {
        int [] nums = {1,3,6};
        int k =3;
        System.out.println(check(nums ,k));
    }
    static int check (int[] nums , int k){
        Arrays.sort(nums);
        int count1 =1;
        int count2 =1;
        while (nums[0]<=nums[nums.length-1] && count1<=k){

                nums[0]=nums[0]+1;
            count1++;
        }
        while (nums[0]<nums[nums.length-1] && count2<=k){

            nums[nums.length-1]=nums[nums.length-1]-1;
            count2++;
        }
        return nums[nums.length-1]-nums[0];
    }
}

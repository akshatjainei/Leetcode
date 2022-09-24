package com.company;

import java.util.Arrays;

public class LeetQ2317 {
    public static void main(String[] args) {
        int [] nums = {3,2,4,6};
        System.out.println(maximumXOR(nums));
    }
    static int maximumXOR(int[] nums) {
        int [] arr = new int [nums.length];
        int max =0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max,nums[i]);
        }
        for(int i =0 ; i <Integer.MAX_VALUE ;i++){
            if(max-Math.pow(2,i)<=0){
                max = i;
                break;
            }
        }
        for(int i =0 ; i < nums.length ; i++){
            for(int j =0 ; j <=max ;j++){
                if(nums[i]-Math.pow(2,j)<0){
                    arr[i]=j;
                    break;
                }
            }
        }
        Arrays.sort(arr);
        int ans = (int) Math.pow(2,arr[nums.length-1]);
        for(int k =0 ; k < nums[nums.length-2] ; k++){
            ans+=Math.pow(2,k);
        }
        return ans;
    }
}

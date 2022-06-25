package com.company;
//https://leetcode.com/problems/intersection-of-two-arrays/submissions/

import java.util.Arrays;

public class LeetQ349 {
    public static void main(String[] args) {
        int [] nums1 = {4,9,5};
        int [] nums2 = {4,5};
        System.out.println(Arrays.toString(new int[] {intersection(nums1,nums2)}));
    }
    static int intersection (int [] nums1 , int []nums2){
        for (int i = 0 ; i < nums1.length ; i++){
            for (int j = 0 ; j<nums2.length ; j++){
                if (nums1[i]==nums2[j]){
                    return nums1[i];
                }
                else{
                     continue;
                }
            }
        }
        return -1;
    }
}

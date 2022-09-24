package com.company;
//https://leetcode.com/problems/intersection-of-two-arrays/submissions/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetQ349 {
    public static void main(String[] args) {
        int [] nums1 = {4,9,5};
        int [] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
    static int[] intersection (int [] nums1 , int []nums2){
        Set <Integer> set = new HashSet<>();
        for(int x: nums1){
            set.add(x);
        }
        int count =0;
        for(int y : nums2){
            if(set.contains(y)){
                count++;
                set.remove(y);
            }
        }
        int [] ans = new int[count];
        for (int i:ans) {
            set.add(i);
        }
        return ans;
    }
}

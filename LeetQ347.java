package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LeetQ347 {
    public static void main(String[] args) {
        int [] arr = {11,11,11,2,2,3,3};
        topKFrequent(arr,3);
    }
    static void topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        int [] ans = new int[k];
        HashMap<Integer , Integer> hm = new HashMap<>();
        ArrayList <Integer> ls = new ArrayList<>();
        ArrayList <Integer> ls1 = new ArrayList<>();
        int count =0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]!=nums[i] || i==nums.length-1){
                hm.put(nums[i-1],count+1) ;
                ls.add(nums[i-1]);
                count=0;
            }
            else count++;
        }
        for (int i = 0; i <ls.size() ;i++) {
            ls1.add(hm.get(ls.get(i)));
        }
        System.out.println(ls1);
    }
}

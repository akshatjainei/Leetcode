package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class LeetQ396 {
    public static void main(String[] args) {
        int [] nums = {4,15,14,3,14,-8,12,-9,17,-1,15,1,10,19,-7,15,8,7,-8,11};
        System.out.println(maxRotateFunction(nums));
    }
    static int maxRotateFunction(int[] nums) {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        int sum = 0;
        int i = 0, k = 0;
        while (k < nums.length) {
            for (int j = 0; j < nums.length; j++) {
                if (i > nums.length - 1) {
                    sum += nums[i % (nums.length)] * j;
                    i++;
                } else {
                    sum += nums[i] * j;
                    i++;
                }
            }
            k++;
            i = k;
            ls.add(sum);
            sum = 0;
        }
        return Collections.max(ls);
    }
}

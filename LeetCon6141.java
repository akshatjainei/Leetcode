package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCon6141 {
    public static void main(String[] args) {
        int [] nums = {4,1,3,3};
        System.out.println(merge(nums));
    }
    static int  merge (int[] nums) {
        int pro = 1;
        for (int k = nums.length; k > nums.length - 2; k--) {
            pro *= k;
        }
        pro = pro / 2;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1 + i; j < nums.length; j++) {
                if(j - i == nums[j] - nums[i]){
                    pro--;
            }
        }
    }
        return pro;
    }
}

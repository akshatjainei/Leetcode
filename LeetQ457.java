package com.company;

public class LeetQ457 {
    public static void main(String[] args) {
        int[]  arr = {-2,1,-1,-2,-2};
        System.out.println(check(arr));
    }
    static boolean check (int [] nums) {
        int i = 0;
        while (i < nums.length) {
            i = i + nums[i];
            if (i < 0) {
                i = -i;
            }
        }
        if (i == nums.length) {
            return true;
        }
        return false;
    }
}


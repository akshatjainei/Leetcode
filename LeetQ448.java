package com.company;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class LeetQ448 {
    public List<Integer> main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> ans = new ArrayList<>();
        sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i + 1 != nums[i]) {
                ans.add(i + 1);
            }
        }
        return ans;
    }
    private static void sort(int[] nums) {
        int i = 0;
        int correct;
        while(i < nums.length) {
            correct = nums[i] - 1;

            if (correct < nums.length && nums[correct] != nums[i]) {
                swap(nums, correct, i);
            }
            else {
                i++;
            }
        }
    }

    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

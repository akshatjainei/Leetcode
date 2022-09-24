package com.company;

import java.util.Arrays;

public class LeetQ2342 {
    public static void main(String[] args) {
        int[] nums = {18,9 ,18};
        System.out.println(maximumSum(nums));
    }

    static int maximumSum(int[] nums) {
        int sum = 0, n = nums.length;
        int[] res = new int[n];
        int [] clone = Arrays.copyOf(nums,n);
        for (int i = 0; i < n; i++) {
            int dig = (int) Math.log10(nums[i]) + 1;
            while (nums[i] > 0) {
                if (nums[i] < 10) {
                    sum += nums[i];
                }
                else {
                    int rem = nums[i] % 10;
                    sum += rem;
                }
                nums[i] /= 10;
            }
            res[i] = sum;
            sum = 0;
        }
        int max =0 , ans =0 , count =0;
        for(int i =0 ; i < n ; i++) {
             max = Math.max(max,res[i]);
        }
        for(int k =0 ; k< n ; k++){
            if(res[k]==max){
                count++;
            }
        }
        if(count>=2) {
            int a =0;
            if(res[a]==max) {
                for (int j = a + 1; j < n; j++) {
                    if (res[j] == max) {
                        ans += clone[j]+clone[a];
                    }
                }
                return ans;
            }
            else {
                a++;
            }
        }
        return -1;
    }
}

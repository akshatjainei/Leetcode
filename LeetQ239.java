package com.company;

import java.util.Arrays;

public class LeetQ239 {
    public static void main(String[] args) {
        int [] nums ={1,3,-1,-3,5,3,6,7};
        int k =3;
        System.out.println(Arrays.toString(check(nums, k)));
    }
    static int [] check (int [] nums , int k){
        int [] ans = new int [nums.length-k+1];
        int max = 0;
        int j =1;
        int count =0;
        while (j<=nums.length-k && count<ans.length+1){
            for (int i = j ; i < k+j-1 ; i++){
                max = Math.max(nums[i-1], nums[i]);
            }
            ans[count]=max;
            max=0;
            count++;
            j++;
        }
        return ans;
    }
}

package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class LeetQ2256 {
    public static void main(String[] args) {
        int [] nums = {5,7,9,0,2,5,753};
        System.out.println(minimumAverageDifference(nums));
    }
    static int minimumAverageDifference(int[] nums) {
        ArrayList <Long> ls = new ArrayList<Long>();
        long sum=0 , avg=0 , count=0;
        for(int i = 0 ; i<nums.length ;i++){
            sum+=nums[i];
        }
        for(int j =0; j <nums.length ; j++){
            count+=nums[j];
            if(nums.length-j-1==0){
                avg = Math.abs(((count)/(j+1)));
            }
            else{
                avg = Math.abs(((count)/(j+1))-((sum-count)/(nums.length-j-1)));
            }
            ls.add(avg);
        }
        long min = Collections.min(ls);
        for(int k=0 ; k < ls.size() ; k++){
            if(ls.get(k)==min){
                return k;
            }
        }
        return -1;
    }
}

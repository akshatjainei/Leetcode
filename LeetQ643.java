package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class LeetQ643 {
    public static void main(String[] args) {
        int [] nums = {5};
        int k = 1;
        System.out.println(check(nums , k));

    }
    static double check (int [] nums , int k){
        int j = 0 ;
        double sum =0;
        ArrayList <Double> ls = new ArrayList<Double>();
        while (j<=nums.length-k){
            for (int i = j ; i < k+j ; i++){
                sum+=nums[i];
            }
            ls.add(sum);
            j++;
            sum=0;
        }
        return Collections.max(ls)/k;
    }
}

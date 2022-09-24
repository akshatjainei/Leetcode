package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeetQ480 {
    public static void main(String[] args) {
        int [] arr = {1,3,-1,-3,5,3,6,7};
        int k =3;
        System.out.println(Arrays.toString(medianSlidingWindow(arr,k)));
    }

    static double[] medianSlidingWindow(int[] nums, int k) {
        ArrayList<Double> ls = new ArrayList<Double>();
        int n = nums.length;
        double[] arr = new double[n - k + 1];
        int i = 0;
        while (i <= n - k ) {
            for (int j = i; j < i + k; j++) {
                ls.add((double) nums[j]);
            }
            Collections.sort(ls);
            if (k % 2 == 1) {
                arr[i] = ls.get((k - 1) / 2);
            } else {
                arr[i] = (ls.get((k) / 2) + ls.get((k - 2) / 2)) / 2;
            }
            i++;
        }
        return arr;
    }
}

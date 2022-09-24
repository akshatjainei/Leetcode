package com.company;

import java.util.Arrays;

public class LeetQ4 {
    public static void main(String[] args) {
        int [] nums1 = {1,3};
        int [] nums2 = {2,4};
        System.out.println(check(nums1,nums2));

    }
    static double check (int [] nums1 , int[] nums2){
        int arr[] = new int [nums1.length + nums2.length ] ;
        int count = 0;
        for(int i = 0 ; i < nums1.length ; i++){
            arr[i]=nums1[i];
            count++;
        }
        for(int j = 0 ; j < nums2.length ; j++){
            arr[count++]=nums2[j];
        }
        Arrays.sort(arr);
        if (arr.length%2==1){
            return arr[(arr.length-1)/2];
        }
        else{
            return (double)(arr[(arr.length)/2]+arr[(arr.length-2)/2])/2;
        }
    }
}

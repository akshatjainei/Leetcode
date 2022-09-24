package com.company;

import java.util.Arrays;

public class LeetQ88 {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};
        int m = 3;
        int n= 3;
        System.out.println(Arrays.toString(check(nums1,nums2,m,n)));
    }
    static int[] check (int [] nums1 , int nums2 [] , int m , int n){
        int [] arr = new int [m+n];
        int count = 0;
        for(int i = 0 ; i <m ; i++){
            arr[i]=nums1[i];
            count++;
        }
        for(int j = 0 ; j<n ; j++){
            arr[count++]=nums2[j];
        }
        Arrays.sort(arr);
        for(int a = 0 ; a<arr.length ; a++){
            nums1[a] = arr[a];
        }
        return nums1;
    }
}

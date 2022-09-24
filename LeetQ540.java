package com.company;
//https://leetcode.com/problems/single-element-in-a-sorted-array/

public class LeetQ540 {
    public static void main(String[] args) {
        int [] arr = {3,3,7,7,10,11,11};
        System.out.println(target(arr));
    }
    static int target (int [] arr ){
        for (int i = 1 ; i < arr.length ; i++){
            if (arr[i-1]!=arr[i] && arr[i]!= arr[i+1]){
                return i;
            }
        }
        return -1;
    }
}

package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class LeetQ1471 {
    public static void main(String[] args) {
        int [] arr = {6,7,11,7,6,8};
        int k =5;
        System.out.println(Arrays.toString(getStrongest(arr, k)));
    }
    static int [] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int median = arr[(n - 1) / 2];
        int [] res = new int[k];
        int i = 0;
        int j = n-1;
        int round =0;
        while(round<k){
            if(Math.abs(arr[i]-median)>Math.abs(arr[j]-median)){
                res[round]=arr[i];
                i++;
            }
            else{
                res[round]=arr[j];
                j--;
            }
            round++;
        }
        return res;
    }
}

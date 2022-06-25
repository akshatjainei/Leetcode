package com.company;

import java.util.Arrays;

public class Dev_to_Rev {
    public static void main(String[] args) {
        int[] num1 = {2,5};
        int[] num2 = {3,4};
        System.out.println(Arrays.toString(kthnumberproduct(num1,num2)));

    }
    static int[] kthnumberproduct(int[] num1 , int [] num2){
        if (num1[0]>num2[0]){
            if (num2[0]>0) {
                for (int j : num1) {
                    for (int k : num2) {
                        int[] arr1 = new int[]{k * j};
                        return arr1;
                    }
                }
            }
            else{
                for (int j : num1) {
                    for (int k : num2) {
                        int[] arr2 = new int[]{j * k};
                        return arr2;
                    }
                }
            }
        }
        return new int[] {-1,-1};
    }
}

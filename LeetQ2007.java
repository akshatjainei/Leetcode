package com.company;

import java.util.Arrays;

public class LeetQ2007 {
    public static void main(String[] args) {
        int [] arr = {1,3,4,2,6,8,2,6,8};
        System.out.println(Arrays.toString(findOriginalArray(arr)));
    }
    static int[] findOriginalArray(int[] mod) {
        int [] ans = new int [mod.length/2];
        Arrays.sort(mod);
        int k =0;
        for(int i =0 ; i < mod.length-1 ; i++){
            for(int j =i+1 ; j < mod.length ; j++){
                if(2*mod[i]==mod[j] && k<mod.length/2 && i!=0){
                    ans[k]=mod[i];
                    k++;
                    mod[j]=0;
                    break;
                }
            }
        }
        return (k==mod.length/2)?ans:new int []{};
    }
}

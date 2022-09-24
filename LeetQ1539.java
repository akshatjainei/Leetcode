package com.company;

import java.util.ArrayList;

public class LeetQ1539 {
    public static void main(String[] args) {
        int []  arr= {1,2,3,4};
        int k = 2;
        System.out.println(check(arr,k));

    }
    static int check (int [] num , int k){
        int i=0;
        int j=1;
        ArrayList<Integer> arr = new ArrayList<>();
        while(arr.size()<=k) {
            if(i<num.length && num[i]==j) {
                i++;
                j++;
                continue;
            }
            arr.add(j);
            j++;
        }
        return arr.get(k-1);

    }
}

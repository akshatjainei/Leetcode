package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class LeetQ1481 {
    public static void main(String[] args) {
        int [] arr = {4,3,1,1,3,3,2};
        System.out.println(findLeastNumOfUniqueInts(arr,3));
    }
    static int findLeastNumOfUniqueInts(int[] arr, int k) {
        Arrays.sort(arr);
        int a =0;
        int max = arr[arr.length-1];
        for(int i =arr.length-1 ; i>=0 ; i--){
            if(arr[i]==max) a++;
            else break;
        }
        ArrayList <Integer> ls = new ArrayList<>();
        HashSet <Integer> hs = new HashSet<>();
        int c =0;
        for (int i = 0; i <arr.length ; i++) {
            int len = hs.size();
            hs.add(arr[i]);
            if(hs.size()==len) {
                c++;
            }
            else{
                ls.add(c+1);
                c=0;
            }
        }
        ls.add(a);
        ls.remove(0);
        Collections.sort(ls);
        int count =k , ans=0;
        for (int i = 0; i <ls.size() ; i++) {
            if(ls.get(i)-count<=0){
                count -= ls.get(i);
                ans++;
            }
            else{
                break;
            }
        }
        return ls.size()-ans;
    }
}

package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeetQ826 {
    public static void main(String[] args) {
        int [] diff = {68,35,52,47,86};
        int [] profit = {67,17,1,81,3};
        int [] worker = {92,10,85,84,82};
        System.out.println(set(diff,profit,worker));
    }
    static int set (int[] diff, int[] profit, int[] worker){
        int i =0  ,sum=0 ;
        while(i<worker.length){
            if(worker[i]>diff[0]){
                sum+=add(i , diff , profit , worker);
            }
            i++;
        }
        return sum;
    }
    static int check (int i ,int[] diff, int[] profit, int[] worker){
        int ans = bsearch(i , diff , worker);
        for(int k = 0 ; k <diff.length ; k++){
            if(ans==diff[k]){
                return k;
            }
        }
        return -1;
    }
    static int bsearch(int i ,int[] diff, int[] worker){
        Arrays.sort(diff);
        int start =0 ;
        int end = diff.length-1;
        int key = worker[i];
        while(start<=end){
            int mid = start+(end-start)/2;
            if(diff[mid]>key){
                end=mid-1;
            }
            else if (diff[mid]<key){
                start=mid+1;
            }
            else{
                return diff[mid];
            }
        }
        return diff[start-1];
    }
    static int  add(int i, int[] diff, int[] profit, int[] worker){
        int index = check(i , diff ,profit ,worker );
        int pro1 = profit[index];
        int diff1 = diff[index];
        ArrayList<Integer> ls = new ArrayList <Integer> ();
        int max = 0;
        for(int k=0 ; k<diff.length ; k++){
            if(diff1>diff[k] && pro1<profit[k]){
                ls.add(profit[k]);
            }
        }
        return Collections.max(ls);
    }
}

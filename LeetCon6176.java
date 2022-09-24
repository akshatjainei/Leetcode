package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeetCon6176 {
    public static void main(String[] args) {
        int [] arr = {0,1,2,0,0,0,2,4,4,1};
        System.out.println(mostFrequentEven(arr));
    }
    static int mostFrequentEven(int[] nums) {
        ArrayList<Integer> ls =  new ArrayList <> ();
        ArrayList<Integer> counter = new ArrayList<>();
        for(int i =0 ; i < nums.length ; i++){
            if(nums[i]%2==0) ls.add(nums[i]);
        }
        for(int j =0 ; j < ls.size() ; j++){
            int count =0;
            for (int i = 0; i < nums.length; i++) {
                if(ls.get(j)== nums[i]){
                    count++;
                }
            }
            counter.add(count);
        }
        int max_i = -1;
        for (int i = 0; i < counter.size(); i++) {
            max_i = Math.max(max_i,counter.get(i));
        }
        int [] arr = new int [ls.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= ls.get(i);
        }
        for (int i = 0; i < counter.size(); i++) {
            if (counter.get(i) != max_i) {
                arr[i]=Integer.MAX_VALUE;
            }
        }
        Arrays.sort(arr);
        if(arr.length==0) return -1;
        return ls.get(0);
    }
}

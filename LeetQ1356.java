package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class LeetQ1356 {
    public static void main(String[] args) {
        int [] num = {0,1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(sortByBits(num)));
    }
    static int[] sortByBits(int[] arr) {
        int [] ans = new int [arr.length] ;
        int count=0;
        for(int i = 0 ; i <arr.length ; i++){
            int num = arr[i];
            while(num>0){
                num=arr[i]&(arr[i]-1);
                count++;
            }
            ans[i]=count;
            count=0;
        }
        HashMap <Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < ans.length; i++) {
            map.put(ans[i],arr[i]);
        }
        //Bubble
        for (int i = 0; i < ans.length; i++) {
            for(int j =1+i ; j < ans.length ; j++){
                if(map.get(ans[i])> map.get(ans[j])) {
                    int temp = ans[i];
                    ans[i] = ans[j];
                    ans[j] = temp;
                }
            }
        }
        return ans;
    }
}

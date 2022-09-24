package com.company;

public class LeetQ2220 {
    public static void main(String[] args) {
        System.out.println(minBitFlips(3,4));
    }
    static int minBitFlips(int start, int goal) {
        int ans =0 , count1 =0 , count2=0;
        while(start>0 || goal>0){
            count1=start&1;
            count2=goal&1;
            if(count1!=count2){
                ans++;
            }
            start/=2;
            goal/=2;
            count1=0;
            count2=0;
        }
        return ans;
    }
}

package com.company;

public class LeetQ793 {
    public static void main(String[] args) {
        System.out.println(preimageSizeFZF(0));
    }
    static int preimageSizeFZF(int k) {
        int count =0 , ans =0 , n=1;
        while(ans<=k) {
            while (n > 0) {
                ans += n / 5;
                n /= 5;
            }
            if(ans==k){
                count++;
            }
            n++;
            if(ans==k+1){
                break;
            }
            ans=0;
        }
        return count;
    }
}

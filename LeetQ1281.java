package com.company;

public class LeetQ1281 {
    public static void main(String[] args) {
        int n =234;
        System.out.println(check(n));

    }
    static int check (int n){
        int sum =0 , pro=1 ;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            pro*=rem;
            n=n/10;
        }
        return pro-sum;
    }
}

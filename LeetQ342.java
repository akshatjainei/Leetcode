package com.company;

public class LeetQ342 {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(check(n));
    }
    static boolean check (int n){
        int pro =power(n);
        if (pro==n){
            return true;
        }
        return false;
    }
    static int power (int n ){
        int pro =1;

        while (pro<n){
            pro *=4;
        }
        return pro;
    }
}

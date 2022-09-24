package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeetQ204 {
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
    static int countPrimes(int n) {
        boolean isPrime[] = new boolean[n];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i =2 ; i*i<n ;i++){
            for(int j=2*i ; j<n ; j+=i){
                isPrime[j]=false;
            }
        }
        int c =0;
        for (boolean b : isPrime) {
            if (b) {
                c++;
            }
        }
        return c;
    }
}

package com.company;

import java.math.BigInteger;

public class LeetQ172 {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(10000));
    }
    static int trailingZeroes(int n) {
        BigInteger fac = new BigInteger(String.valueOf(1));
        for(int i =n ; i>0 ; i--){
            BigInteger x = new BigInteger(String.valueOf(i));
            fac = fac.multiply(x);
        }
        int count =0;
        String s = fac.toString();
        for(int i = s.length()-1 ; i >=0 ; i--){
            if(s.charAt(i)=='0'){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}


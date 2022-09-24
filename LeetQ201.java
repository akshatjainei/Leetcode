package com.company;

public class LeetQ201 {
    public static void main(String[] args) {
        int left = 5;
        int right =7;
        System.out.println(rangeBitwiseAnd(left,right));
    }
    static int rangeBitwiseAnd(int left, int right) {
        int c =0;
        while(left!=right){
            left>>=1;
            right>>=1;
            c++;
        }
        return left<<c;
    }
}

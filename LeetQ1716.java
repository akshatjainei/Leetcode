package com.company;

public class LeetQ1716 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(check(n));
    }
    static int check(int n){
        int round = (n/7)+1 , j=0 , sum=0;
        while(j<=round){
            for(int i = 1+j; i <=7+j ; i++){
                sum+=i;
            }
            j++;
        }
        return sum;
    }
}

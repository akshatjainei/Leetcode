package com.company;

import java.util.Arrays;

public class LeetQ1701 {
    public static void main(String[] args) {
        int [][] cust = {{5,2},{5,4},{10,3},{20,1}};
        System.out.println(averageWaitingTime(cust));
    }
    static double averageWaitingTime(int[][] cust) {
        int sum = cust[0][0];
        int [] arr = new int [cust.length];
        for(int i =0 ; i < cust.length ; i++){
            sum += cust[i][1];
            if(sum-cust[i][0]<=0) arr[i]=cust[i][1];
            else arr[i]=sum-cust[i][0];
        }
        double s = 0 , avg =0;
        for(int i = 0 ; i < arr.length ; i++){
            s += arr[i];
        }
        avg = s/arr.length;
        return avg;
    }
}

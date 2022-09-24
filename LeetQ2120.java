package com.company;

import java.util.Arrays;

public class LeetQ2120 {
    public static void main(String[] args) {
        int [] arr = {0,1};
        System.out.println(Arrays.toString(executeInstructions(3, arr, "RRDDLU")));
    }
    static int[] executeInstructions(int n, int[] startPos, String s) {
        int [] ans = new int [s.length()];
        for (int i = 0; i < s.length(); i++) {
            int count =0;
            int x = startPos[0];
            int y = startPos[1];
            for (int j = i; j < s.length(); j++) {
                if(s.charAt(j)=='R'){
                    y+=1;
                }
                if(s.charAt(j)=='L'){
                    y-=1;
                }
                if(s.charAt(j)=='U'){
                    x-=1;
                }
                if(s.charAt(j)=='D'){
                    x+=1;
                }
                if(x<0 || x>=n || y<0 || y>=n){
                    break;
                }
                else {
                    count++;
                }
            }
            ans[i]=count;
        }
            return ans;
        }
    }

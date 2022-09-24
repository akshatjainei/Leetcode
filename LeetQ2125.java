package com.company;

import java.util.ArrayList;

public class LeetQ2125 {
    public static void main(String[] args) {
        String[] arr = {"011001","000000","010100","001000"};
        System.out.println(numberOfBeams(arr));
    }
    static int numberOfBeams(String[] bank) {
        ArrayList <Integer> ls = new ArrayList<>();
        for(int i = 0 ; i < bank.length ;i++){
            int countOnes = 0;
            for(char c : bank[i].toCharArray()) if(c=='1') countOnes++;
            if(countOnes>0) ls.add(countOnes);
        }
        int ans =0;
        int n = ls.size()-1;
        for(int i=0;i<n;i++){
            int val = ls.get(i)*ls.get(i+1);
            ans+=val;
        }
        return ans;
    }
}

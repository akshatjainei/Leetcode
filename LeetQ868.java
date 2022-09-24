package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class LeetQ868 {
    public static void main(String[] args) {
        System.out.println(binaryGap(22));
    }
    static int binaryGap(int n) {
        ArrayList <Integer> li = new ArrayList<>();
        int count =0 , max =0 , flag =0;
        while(n>0){
            count=n&1;
            li.add(count);
            n/=2;
            count =0;
        }
        Collections.reverse(li);
        for(int i = 0 ; i < li.size() ; i++){
            for(int j = 1+i; j < li.size() ; j++){
                if(li.get(i)==1 && li.get(j)==1){
                    max = Math.max(max,j-i);
                    if(li.get(j-1)==1 && li.get(j)==1){
                        flag = j-i;
                    }
                }
            }
        }
        return flag;
    }
}

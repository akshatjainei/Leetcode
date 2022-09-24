package com.company;

import java.text.CollationElementIterator;
import java.text.CollationKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeetQ1093 {
    public static void main(String[] args) {
        int [] count = {0,1,3,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(Arrays.toString(sampleStats(count)));
    }

    static double[] sampleStats(int[] count) {
        ArrayList<Double> ls = new ArrayList<Double>();
        double [] ans = new double [5];
        int mode =0;
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (j < count[i]) {
                ls.add((double)i);
                j++;
            }
            j = 0;
            mode=Math.max(mode,count[i]);
        }
        for(int k =0 ; k <count.length; k++){
            if(mode==count[k]){
                ans[4]=k;
            }
        }
        double sum =0;
        ans[0]=Collections.min(ls);
        ans[1]=Collections.max(ls);
        for(int i =0 ; i< ls.size(); i++){
            sum += ls.get(i);
        }
        ans[2]=sum/ls.size();
        int place=0 , countEl =count[0];
        int whereToStop=0;
        while(whereToStop<countEl/2){
            whereToStop+=count[place];
            place++;
        }
        place--;
        if(countEl%2==1){
            if(whereToStop==countEl/2){
                place++;
                while(count[place]==0)
                    place++;
            }

            ans[3]=place;
        }
        int n = ls.size();
        if (n % 2 ==1) {
            ans[3] = ls.get(n/ 2);
        }
        else {
            ans [3]=  (ls.get((n - 2)/2) + ls.get(n / 2)) / 2.0;
        }
        return ans;
    }
}

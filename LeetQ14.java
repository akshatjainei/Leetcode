package com.company;

import java.util.Arrays;

public class LeetQ14 {
    public static void main(String[] args) {
        String [] strs = {"flower","flow","flight"};
        System.out.println(check(strs));

    }
    static String check (String [] strs){
        int j =0;
        Arrays.sort(strs);
        String ans = "";
        while (j < strs[strs.length-1].length())
            for (int i = 1 ; i < strs.length ; i++){
                if (strs[(i-1)].charAt(j)==strs[i].charAt(j)){
                    ans = ""+strs[(i-1)].charAt(j);
                }
                else{
                    break;
                }
                j++;
            }
        return ans;
    }
}

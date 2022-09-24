package com.company;

import java.util.Arrays;

public class LeetQ1545 {
    public static void main(String[] args) {
        System.out.println(findKthBit(3,1));
    }
    static char findKthBit(int n, int k) {
        String first = "0";
        int i =0;
        while(i<n) {
            first = first + "1" + rev(inv(first));
            i++;
        }
        return first.charAt(k-1);
    }
    static String inv(String f){
        char [] c = f.toCharArray();
        for (int i = 0; i <c.length ; i++) {
            if(c[i]=='0'){
                c[i]='1';
            }
            else{
                c[i]='0';
            }
        }
        String d = Arrays.toString(c);
        return d;
    }
    static String rev (String f){
        char [] ans = new char[f.length()];
        int j =0;
        for(int i = f.length()-1 ; i>=0 ;i++){
            ans[j]=f.charAt(i);
            j++;
        }
        return Arrays.toString(ans);
    }
}

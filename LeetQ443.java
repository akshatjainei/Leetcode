package com.company;

import java.util.ArrayList;

public class LeetQ443 {
    public static void main(String[] args) {
        char [] c = {'a','a','b','b','c' , 'c', 'c'};
        System.out.println(compress(c));
    }
    static int compress(char[] chars) {
        if(chars.length==1) return 1;
        ArrayList <Integer> ls = new ArrayList<>();
        int count =0;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < chars.length ; j++) {
                if((char)(i+'a')==chars[j]){
                    count++;
                }
            }
            if(count>0) {
                ls.add(count);
            }
            count=0;
        }
        int ans = 0;
        for (int i = 0; i <ls.size() ; i++) {
            if(ls.get(i)==1) ans+=1;
            else ans+=(int)Math.log10(ls.get(i))+2;
        }
        return ans;
    }
}

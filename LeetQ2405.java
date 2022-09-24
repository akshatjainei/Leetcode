package com.company;

import java.util.HashSet;

public class LeetQ2405 {
    public static void main(String[] args) {
        System.out.println(partitionString("abacaba"));
    }
    static int partitionString(String s) {
        HashSet <Character> hs = new HashSet<>();
        int len = s.length() , count = 0;
        for (int i = 0; i < len; i++) {
            if(!hs.contains(s.charAt(i))){
                hs.add(s.charAt(i));
            }
            else{
                count++;
                i--;
                hs.clear();
            }
        }
        return count;
    }
}

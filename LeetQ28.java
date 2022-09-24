package com.company;

public class LeetQ28 {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "but"));
    }
    static int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)) return -1;
        else{
            for (int i = 0; i <= haystack.length()-needle.length(); i++) {
                String str = haystack.substring(i);
                if(str.startsWith(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}

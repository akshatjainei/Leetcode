package com.company;

import java.util.Collections;

public class LeetQ2255 {
    public static void main(String[] args) {
        String [] words = {"a","b","c","ab","bc","abc"};
        String s = "abc";
        System.out.println(countPrefixes(words,s));
    }
    static int countPrefixes(String[] words, String s) {
        int c =0;
        for (String word : words) {
            if (s.startsWith(word)) {
                c++;
            }
        }
        return c;
    }
}

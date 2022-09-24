package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class LeetQ1081 {
    public static void main(String[] args) {
        System.out.println(smallestSubsequence("bcabc"));
    }
    static String smallestSubsequence(String s) {
        char [] c = s.toCharArray();
        HashSet <Character> hs = new HashSet<Character>();
        for (int i = 0; i < c.length; i++) {
            hs.add(c[i]);
        }
        ArrayList <Character> b = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if(hs.contains((char)('a'+i))) b.add((char)('a'+i));
        }
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < b.size(); i++) {
            build.append(b.get(i));
        }
        return build.toString();
    }
}

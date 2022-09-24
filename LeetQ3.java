package com.company;

import java.util.HashSet;

public class LeetQ3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }
    static int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int count =0 , max =0;
        for(int i =0 ; i < s.length() ; i++){
            if(!hs.contains(s.charAt(i))){
                hs.add(s.charAt(i));
                count++;
            }
            else{
                count =0;
                hs.clear();
                hs.add(s.charAt(i));
                count++;
            }
            max = Math.max(count , max);
        }
        return max;
    }
}

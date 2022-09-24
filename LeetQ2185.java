package com.company;

public class LeetQ2185 {
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pre = "at";
        System.out.println(prefixCount(words,pre));

    }
    static int prefixCount(String[] words, String pref) {
        int c =0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                c++;
            }
        }
        return c;
    }
}

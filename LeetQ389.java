package com.company;
//https://leetcode.com/problems/find-the-difference/

public class LeetQ389 {
    public static void main(String[] args) {
        String str = "Akshat";
        char[] ch = new char [str.length()];
        for (int i =0 ; i<str.length() ; i++){
            ch[i]=str.charAt(i);
        }
        for (char c :ch){
            System.out.println(c);
        }
    }
}
